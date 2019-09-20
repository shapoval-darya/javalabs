package by.bntu.fitr.povt.createforfun.javalabs.model.logic.logic;

import by.bntu.fitr.povt.createforfun.javalabs.model.logic.container.*;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.Toy;
import by.bntu.fitr.povt.createforfun.javalabs.view.Printer;

public class Logic {
    public static final int BASE = 0;
    
    public static int summarizeCost(Gameroom gameroom) {
        int cost = BASE;
        for(int i = BASE; i < gameroom.getLenght(); i++){
            Printer.printtrace(String.valueOf(cost));
            cost += gameroom.getToy(i).getCost();
        }
        Printer.printinfo(String.valueOf(cost));
        return cost;
    }
    
    public static int summarizeWeight(Gameroom gameroom) {
        int weight = BASE;
        for(int i = BASE; i < gameroom.getLenght(); i++){
            Printer.printtrace(String.valueOf(weight));
            weight += gameroom.getToy(i).getWeight();
        }
        Printer.printinfo(String.valueOf(weight));
        return weight;
    }
    
    public static Toy findTheMostExpensive(Gameroom gameroom) {
        int expensive = BASE;
        for(int i = BASE; i < gameroom.getLenght(); i++){
            Printer.printtrace(String.valueOf(expensive));
            if (gameroom.getToy(i).getCost() > gameroom.getToy(expensive).getCost()){
                Printer.printdebug(String.valueOf(expensive));
                expensive = i;
            }
        }
        Printer.printinfo(gameroom.getToy(expensive).toString());
        return gameroom.getToy(expensive);
    }
}
