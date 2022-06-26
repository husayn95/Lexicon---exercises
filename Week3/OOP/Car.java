package LexiconJava.Exercises.Week3.OOP;

public class Car {
    //id, year, model, colour, motorSize

    private String id;
    private int year;
    private String model;
    private String colour;
    private double motorSize;


    public Car(String model, double motorSize){
        this.model = model;
        this.motorSize = motorSize;
    }


    public void drive(){

//model + ” with motor ” + motorSize + ” can drive now.”
        System.out.println(model + " with motor " + motorSize + " can drive now!");

    }


}
