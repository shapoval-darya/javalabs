package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

import java.util.logging.Logger;


public class Cube extends Toy{
    private int volume;

    public Cube() {
        this.volume = 0;
    }
    
    public Cube(int value) {
        this.volume = value;
    }

    public Cube(int value, String name, int cost, int weight) {
        super(name, cost, weight);
        this.volume = value;
    }

    public Cube(int value, Toy toy) {
        super(toy);
        this.volume = value;
    }

    public int getValue() {
        return volume;
    }

    public void setValue(int value) {
        this.volume = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.volume;
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
        final Cube other = (Cube) obj;
        if (this.volume != other.volume) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
            msg.append("Value - ").append(volume).append("\n");
        return msg.toString();
    }
}
