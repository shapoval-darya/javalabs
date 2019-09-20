package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

import java.util.Objects;

public class Toy {
    private final int BASE = 0;
    
    private String name;
    private int cost;
    private int weight;

    public Toy() {
        this.name = "no name";
        this.cost = BASE;
        this.weight = BASE;
    }

    public Toy(String name, int cost, int weight) {
        this.name = name;
        if (cost > BASE) {
            this.cost = cost;
        } else {
            this.cost = BASE;
        }
        if (weight > BASE) {
            this.weight = weight;
        } else {
            this.weight = BASE;
        }
    }

    public Toy(Toy toy) {
        this.name = toy.name;
        this.cost = toy.cost;
        this.weight = toy.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.BASE;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.cost;
        hash = 53 * hash + this.weight;
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
        final Toy other = (Toy) obj;
        if (this.BASE != other.BASE) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append("Toy - ").append(name).
                append("\nWeight - ").append(weight).
                append("\nCost - ").append(weight).
                append("\n");

        return msg.toString();
    }

}
