package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

public class Car extends Toy {

    private int speed;

    public Car() {
        this.speed = 0;
    }
    
    public Car(int speed) {
        this.speed = speed;
    }

    public Car(int speed, String name, int cost, int weight) {
        super(name, cost, weight);
        this.speed = speed;
    }

    public Car(int speed, Toy toy) {
        super(toy);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.speed;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.speed != other.speed) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
            msg.append("Speed - ").append(speed).append("\n");
        return msg.toString();
    }
}
