package by.bntu.fitr.povt.createforfun.javalabs.model.logic;

import by.bntu.fitr.povt.createforfun.javalabs.model.logic.container.*;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.entity.*;
import by.bntu.fitr.povt.createforfun.javalabs.model.logic.logic.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {
    @Test
    public void testSummarizeOfCost() {
        Gameroom gameroom = new Gameroom (new Car(5,"Car", 4, 0),
                                        new Doll (5,"Doll", 4, 0),
                                        new Ball (5,"Ball", 4, 0),
                                        new Cube (5,"Cube",4,0));
        int expResult = 16 ;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeOfCost1() {
        Gameroom gameroom = new Gameroom (new Car(5,"122", -5, 4),
                                        new Doll (5,"122", 4, 4),
                                        new Ball (5,"122", 4, 4),
                                        new Cube (5,"Cube",4,0));
        int expResult =  12;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeOfCost2 () {
        Gameroom gameroom = new Gameroom (new Car(5,"122", -5, 4),
                                        new Doll (5,"122", -5, 4),
                                        new Ball (5,"122", -5, 4),
                                        new Cube (5,"Cube",-5,0));
        int expResult = 0 ;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeOfCost4 () {
        Gameroom gameroom = new Gameroom (new Car(5,"122", 8, 4));
        int expResult = 8 ;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testSummarizeOfCost3 () {
        Gameroom gameroom = new Gameroom ();
        int expResult = 0 ;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
     public void ttestSummarizeOfCost3 () {
        Gameroom gameroom = null;
        int expResult =  0;
        int result = Logic.summarizeCost(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void ttestSummarizeOfWeight () {
        Gameroom gameroom = new Gameroom (new Car(5,"Car", 4, 4),
                                        new Doll (5,"Doll", 4, 8),
                                        new Ball (5,"Ball", 4, 1),
                                        new Cube (5,"Cube",4,3));
        int expResult = 16 ;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void ttestSummarizeOfweight2 () {
        Gameroom gameroom = new Gameroom (new Car(5,"122", 4, -4),
                                        new Doll (5,"122", 9, 4),
                                        new Ball (5,"122", 8, 4),
                                        new Cube (5,"Cube",7,10));
        int expResult =  18;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    public void ttestSummarizeOfWeight1 () {
        Gameroom gameroom = new Gameroom (new Car(5,"122", -5, -4),
                                        new Doll (5,"122", -5, -4),
                                        new Ball (5,"122", -5, -4),
                                        new Cube (5,"Cube",-5, 0));
        int expResult =  0;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    public void ttestSummarizeOfWeight2 () {
        Gameroom gameroom = new Gameroom (new Car(5,"122", 5, 4));
        int expResult =  4;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    public void ttestSummarizeOfWeight3 () {
        Gameroom gameroom = new Gameroom ();
        int expResult =  0;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
     public void ttestSummarizeOfWeightnull () {
        Gameroom gameroom = null;
        int expResult = 0 ;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
     
    @Test
    public void ttestthemostexpensive () {
        Gameroom gameroom = new Gameroom (new Car(5,"Car", 4, 4),
                                        new Doll (5,"Doll", 8, 8),
                                        new Ball (5,"Ball", 7, 1),
                                        new Cube (5,"Cube",4,3));
        Toy expResult = new Doll (5,"Doll", 8, 8) ;
        Toy result = Logic.findTheMostExpensive(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

   @Test
    public void ttestthemostexpensive2 () {
        Gameroom gameroom = new Gameroom (new Car(5,"Car", 4, 4),
                                        new Doll (5,"Doll", -5, 8),
                                        new Ball (5,"Ball", 7, 1),
                                        new Cube (5,"Cube",4,3));
        Toy expResult = new Ball (5,"Ball", 7, 1) ;
        Toy result = Logic.findTheMostExpensive(gameroom);
       
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void ttestthemostexpensive3 () {
        Gameroom gameroom = new Gameroom (new Car(5,"Car", 4, 4));
        Toy expResult = new Car(5,"Car", 4, 4) ;
        Toy result = Logic.findTheMostExpensive(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void ttestthemostexpensive4 () {
        Gameroom gameroom = new Gameroom ();
        Toy expResult = null ;
        Toy result = Logic.findTheMostExpensive(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
     public void ttestSummarizeOfCost6 () {
        Gameroom gameroom = null;
        int expResult = 0 ;
        int result = Logic.summarizeWeight(gameroom);
       
        Assert.assertEquals(expResult, result);
    }
}
