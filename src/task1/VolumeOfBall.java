package task1;

import java.util.Scanner;

public class VolumeOfBall {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the Radius:");

        float radius = myobj.nextFloat();

        double volume = (4.00/3.00) * 3.1416 * Math.pow(radius,3);

        if (radius <= 0 ) {
            System.out.println("Radius must be positive numbers.");
        } else {
            System.out.printf("The volume of ball: %.2f%n", volume);
        }



    }
}