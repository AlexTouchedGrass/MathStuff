import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int numSides = 0;
        int roll = 0;

        //ask the user for number of sides on the die
        System.out.println("How many sides are on your chosen die?");
        if (scan.hasNextInt()) {
            numSides = scan.nextInt();
        }
        else {
            System.out.println("You have entered an invalid number of sides.");
            System.exit(0);
        }

        //calculate a random number from 1-# of sides on the die
        roll = (int)(Math.random()*numSides)+1;

        //output the roll
        System.out.println("You rolled: " + roll);

    }
}