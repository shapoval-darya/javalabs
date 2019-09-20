package by.bntu.fitr.povt.createforfun.javalabs.model.logic.container;

//import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.*;

public class Non {
    private Object [] arrayOfObject;
    
    public Non() {
        this.arrayOfObject = new Object [0];
    }

    public Non(Object ... arrayOfObject)
    {
        this.arrayOfObject = arrayOfObject;
    }
    
    public Non( Non airline){
        this.arrayOfObject = airline.arrayOfObject;
    }
    
    public Object [] getArray()
    {
        return arrayOfObject;
    }

    public void setArray(Object [] arrayOfObject) {
        this.arrayOfObject = arrayOfObject;
    }
    
    public int getLenght() {
        return this.arrayOfObject.length;
    }
    
    public Object getObject(int index){
        for(int i = 0; i < this.arrayOfObject.length; i++){
            if (index == i){
                return this.arrayOfObject[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        for (Object plain :arrayOfObject) {
            msg.append("Airline - ").append(plain).append("\n");
        }
        return msg.toString();
    }
}
