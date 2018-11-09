/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 01: Fish Tank;
 *
 */

public class Fish {
//    Declare Class Attributes
    private String name;
    private int weight;

//    Declare Default Constructor
    public Fish(){
        name = "";
        weight = 0;
    }

//    Declare Constructor
    public Fish(String fishName, int fishWeight){
        name = fishName;
        weight = fishWeight;
    }

//    Defining Set Methods
    // Method to set private 'name' attribute
    public void setName(String newName){
        name = newName;
    }

    // Method to set private 'weight' attribute
    public void setWeight(int newWeight){
        weight = newWeight;
    }

//    Defining Get Methods
    // Method to get private 'name' attribute
    public String getName(){
        return name;
    }

    // Method to get private 'weight' attribute
    public int getWeight(){
        return weight;
    }

//    Defining toString Method
    // Method to concatenate class attributes in to a string
    public String toString(){
        return ("Name: " + name + ", Weight: " + weight + ";");
    }



}