package by.bntu.fitr.povt.createforfun.javalabs.controller;

import by.bntu.fitr.povt.createforfun.javalabs.model.logic.container.Gameroom;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.*;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.logic.Logic;
import by.bntu.fitr.povt.createforfun.javalabs.view.Printer;

public class Task5 {

    public static void main(String[] args) {
        Gameroom gameroom = new Gameroom (new Car(5,"122", -5, 4),
                                        new Doll (5,"122", 4, 4),
                                        new Ball (5,"122", 4, 4),
                                        new Cube (5,"Cube",4,0));
        int result = Logic.summarizeCost(gameroom);
        Printer.printinfo("" + result );
    }
}
