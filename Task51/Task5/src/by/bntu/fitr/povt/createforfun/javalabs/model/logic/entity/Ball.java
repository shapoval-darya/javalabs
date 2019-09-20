package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;


public class Ball extends Toy{
    private int colour;

    
    public Ball() {
        this.colour = 0;
    }
    
    public Ball(int colour) {
        this.colour = colour;
    }

    public Ball(int colour, String name, int cost, int weight) {
        super(name, cost, weight);
        this.colour = colour;
    }

    public Ball(int colour, Toy toy) {
        super(toy);
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.colour;
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
        final Ball other = (Ball) obj;
        if (this.colour != other.colour) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
            msg.append("Colour - ").append(colour).append("\n");
        return msg.toString();
    }
}
