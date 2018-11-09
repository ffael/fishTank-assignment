/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 01: Fish Tank;
 *
 */

import java.util.ArrayList;

public class Tank {
//    Declare Class Attributes
    private ArrayList<Fish> tank;

//    Declare Default Constructor
    public Tank(){
        tank = new ArrayList();
    }

//    Declare a method to access 'tank' ArrayList attributes and methods
    public ArrayList<Fish> getTank(){
        return tank;
    }

//    Method to add a 'fish' object to the 'tank' ArrayList
    public void addFish(Fish fish){
        tank.add(fish);
    }

//    Method to "feed" fish
    public void feedFish(int fishIndex, int howMuch){
        Fish aFish = tank.get(fishIndex); //Assigns a fish from tank to 'aFish' object

        aFish.setWeight(aFish.getWeight() + howMuch); //Adds weight to fish based on the 'howMuch' parameter
    }

    public void starveFish(int fishIndex, int howMuch){
        Fish aFish = tank.get(fishIndex); //Assigns a fish from tank to 'aFish' object

        if(aFish.getWeight() > 0) { //Checks if fish's weight is greater than 0, so weight can be removed
            aFish.setWeight(aFish.getWeight() - howMuch); //Removes weight from fish based on the 'howMuch' parameter
        }

    }

//    Method to retrieve 'name' of a given fish based on 'fishIndex' parameter
    public String getNameFor(int fishIndex){
        return tank.get(fishIndex).getName();
    }

//    Method to retrieve 'weight' of a given fish based on 'fishIndex' parameter
    public int getWeightFor(int fishIndex){
        return tank.get(fishIndex).getWeight();
    }

//    Method to retrieve the total 'weight' of all fishes in tank
    public int getTotalWeight(){
        // Declare and initiate 'totalWeight' variable
        int totalWeight = 0;
        for(int i = 0; i < tank.size(); i++){
            // Go through all fishes in the tank, get their 'weight', sum up and assign to 'totalWeight' variable
            totalWeight += tank.get(i).getWeight();
        }
        // Returns 'totalWeight'
        return totalWeight;
    }

//    Method to find the heaviest fish in the tank
    public Fish getLargest(){
        // Declare and assign a new fish to 'biggestFish'
        Fish biggestFish = new Fish();

        // Go through all fishes in the tank
        for(int i = 0; i < tank.size(); i++){

            // Compare the 'weight' of current fish in the loop with the 'biggestFish' weight
            if(tank.get(i).getWeight() > biggestFish.getWeight()){

                // Sets the 'name' of 'biggestFish' to have the name of the fish with more weight
                biggestFish.setName(
                        tank.get(i).getName());

                // Sets the 'weight' of 'biggestFish' to have the weight of the fish with more weight
                biggestFish.setWeight(
                        tank.get(i).getWeight());
            }
        }
        // Returns 'biggestFish' object;
        return biggestFish;

    }

    public Fish getSmallest(){
        // Declare new fish to 'smallestFish' and assign 'biggestFish' attributes
        Fish smallestFish = getLargest();

        // Go through all fishes in the tank
        for(int i = 0; i < tank.size(); i++) {

            // Compare the 'weight' of current fish in the loop with the 'smallestFish' weight
            if (tank.get(i).getWeight() < smallestFish.getWeight()) {

                // Sets the 'name' of 'smallestFish' to have the name of the fish with less weight
                smallestFish.setName(
                        tank.get(i).getName());

                // Sets the 'weight' of 'smallestFish' to have the weight of the fish with less weight
                smallestFish.setWeight(
                        tank.get(i).getWeight());
            }
        }

        // Returns 'biggestFish' object;
        return smallestFish;

    }

//    Method to check if fish exists in the Tank
    public boolean doesExist(Fish aFish){

        // Go through all fishes in the tank
        for(int i = 0; i < tank.size(); i++){
            // Checks if 'aFish' is in the tank
            if(tank.get(i).equals(aFish)){
                // Returns true if found
                return true;
            }
        }
        // Returns false if 'aFish' is not in tank
        return false;

    }

//    Method to create an Array and populate it with objects in Tank
    public Fish[] transfer(){
        // Declares a Fish type Array and assigns its size to have Tanks size
        Fish[] newTank = new Fish[tank.size()];

        // Go through all fishes in the tank
        for(int i = 0; i < tank.size(); i++){
            // Assign the fishes inside tank to 'newTank' Array
            newTank[i] = tank.get(i);
        }

        // Return 'newTank' Array
        return newTank;
    }
}


