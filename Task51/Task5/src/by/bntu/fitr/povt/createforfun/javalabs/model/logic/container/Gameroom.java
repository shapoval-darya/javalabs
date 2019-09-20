package by.bntu.fitr.povt.createforfun.javalabs.model.logic.container;

import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.*;

public class Gameroom {
    private Toy [] arrayOfToy;
    
    public Gameroom() {
        this.arrayOfToy = new Toy [0];
    }

    public Gameroom(Toy ... arrayOfToy)
    {
        this.arrayOfToy = arrayOfToy;
    }
    
    public Gameroom( Gameroom gameroom){
        this.arrayOfToy = gameroom.arrayOfToy;
    }
    
    public Toy [] getArray()
    {
        return arrayOfToy;
    }

    public void setArray(Toy [] arrayOfToy) {
        this.arrayOfToy = arrayOfToy;
    }
    
    public int getLenght() {
        return this.arrayOfToy.length;
    }
    
    public Toy getToy(int index){
        for(int i = 0; i < this.arrayOfToy.length; i++){
            if (index == i){
                return this.arrayOfToy[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        for (Toy toy :arrayOfToy) {
            msg.append("Gameroom - ").append(toy).append("\n");
        }
        return msg.toString();
    }
}
