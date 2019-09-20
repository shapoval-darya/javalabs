package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;

public class Doll extends Toy {

    private int growth;

    public Doll() {
        this.growth = 0;
    }
    
    public Doll(int growth) {
        this.growth = growth;
    }

    public Doll(int growth, String name, int cost, int weight) {
        super(name, cost, weight);
        this.growth = growth;
    }

    public Doll(int growth, Toy toy) {
        super(toy);
        this.growth = growth;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        if (growth > 0) {
            this.growth = growth;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.growth;
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
        final Doll other = (Doll) obj;
        if (this.growth != other.growth) {
            return false;
        }
        return true;
    }

     @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
            msg.append("Growth - ").append(growth).append("\n");
        return msg.toString();
    }
}
