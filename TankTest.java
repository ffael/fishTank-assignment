/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 01: Fish Tank;
 *
 */

public class TankTest{

    public static void main(String[] args)   {

        Tank tank = new Tank();
//        Add Fish to the Tank
        tank.addFish( new Fish("Doris", 10) );
        tank.addFish( new Fish("Nemo", 40) );
        tank.addFish( new Fish("Bob", 5) );
        tank.addFish( new Fish("Shark", 15) );
//        Prints fishes in the tank;
        System.out.println("-- Fishes in Tank");
        for (Fish aFish:
             tank.getTank()) {
            System.out.println(" • " + aFish.toString());
        }
        System.out.println(); // Line Break;

//        Feed Fishes in the Tank
        tank.feedFish( 0, 2 );
        tank.feedFish( 1, 3 );
        tank.feedFish( 2, 5 );
        tank.feedFish( 3, 4 );

//        Starve Fishes in the Tank
        tank.starveFish( 0, 3 );
        tank.starveFish( 1, 1 );
        tank.starveFish( 2, 2 );
        tank.starveFish( 3, 1 );

//        use a loop to go through the array and print out the Fish objects’ data.
        System.out.println("-- Fishes in Tank (After Being Fed and Starved):");
        for (int i = 0; i < tank.getTank().size(); i++){
            System.out.println(" • " + tank.getTank().get(i));
        }
        System.out.println(); //Line Break;

        System.out.println("-- Information About the Tank:");
        System.out.println( "  « The total weight in the tank is : " + tank.getTotalWeight( ) + ";" );
        System.out.println( "  « The largest Fish in the tank is : " + tank.getLargest( ).getName() + ";" );
        System.out.println( "  « The smallest Fish in the tank is : " + tank.getSmallest( ).getName() + ";" );
        System.out.println(); //Line Break;

        // call transfer method
        tank.transfer();

        // print the content of the array, using a for-each loop
        System.out.println("-- Fishes in Copied Tank:");
        for (Fish arrayItem: tank.transfer()
             ) {
            System.out.println(" • " + arrayItem.toString());
        }
    }
}
