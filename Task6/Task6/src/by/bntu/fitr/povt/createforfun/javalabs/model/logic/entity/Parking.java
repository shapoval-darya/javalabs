package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger; 

public class Parking {

    private final int LIMIT = 100;
    private boolean free ;
    private TimeUnit time;
    private Lock lock ;
    private Condition condition ;
    private Logger LOG;

    public Parking() {
        lock = new ReentrantLock();
        condition = lock.newCondition();
        LOG = Logger.getRootLogger();
        free = true;
    }

    public Lock getLock() {
        return lock;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void setCar(String car, int seconds) {

        try {
            
            LOG.info("Припарковался: " + car + " на " + seconds);
            time.MILLISECONDS.sleep(seconds);
            LOG.info("Освободил: " + car);
        } catch (InterruptedException e) {
            LOG.error(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}
