package by.bntu.fitr.povt.createforfun.javalabs.controller;

import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.Car;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.CarPark;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.Parking;

public class Test {

    public static void main(String[] args) {
        CarPark carpark = new CarPark(new Parking(),new Parking());
        //CarPark carpark = null;
        Car first = new Car("Porche",100,carpark);
        Car second = new Car("Ford",100,carpark);
        Car thrird = new Car("Mers",100,carpark);
        Car fourth = new Car("BMW",100,carpark);
    }
}
