package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class Car implements Runnable {

    private String name;
    private Thread thread;
    private CarPark carpark;
    private int seconds;
    private TimeUnit time;
    private Logger LOG = Logger.getRootLogger();

    public Car(String name, int seconds, CarPark carpark) {
        this.name = name;
        this.carpark = carpark;
        this.seconds = seconds;
        thread = new Thread(this);
        thread.start();
    }

    public void end() {
        LOG.info("Уехал");
    }

    public int findPlace() {
        for (int i = 0; i < carpark.getLenght(); i++) {
            if (carpark.getParking(i).getLock().tryLock()) {
                carpark.getParking(i).setCar(name, seconds);
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void run() {
        if (!(carpark == null)) {
            int flag = findPlace();
            if (flag == -1) {
                try {
                    time.MILLISECONDS.sleep(2000);
                } catch (InterruptedException e) {
                    LOG.error(e.getMessage());
                }
                findPlace();
                
            }
        } else {
            LOG.warn("Null carpark");
        }
    }
}

