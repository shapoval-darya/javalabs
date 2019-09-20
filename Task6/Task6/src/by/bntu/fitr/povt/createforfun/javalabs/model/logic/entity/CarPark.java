package by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity;


public class CarPark {
    private Parking [] parking;
    
    public CarPark() {
        this.parking = new Parking [0];
    }

    public CarPark(Parking ... parking)
    {
        this.parking = parking;
    }
    
    public CarPark(CarPark carpark){
        this.parking = carpark.parking.clone();
    }
    
    public Parking [] getArray()
    {
        return parking;
    }
    
    public void setArray(Parking [] parking) {
        this.parking = parking;
    }
    
    public int getLenght() {
        return this.parking.length;
    }
    
    public Parking getParking(int index){
        for(int i = 0; i < this.parking.length; i++){
            if (index == i){
                return this.parking[i];
            }
        }
        return null;
    }
}
