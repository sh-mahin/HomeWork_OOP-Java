 import java.util.Scanner;

public class VolumeOfBall {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the Radious:");

        float radious = myobj.nextFloat();

        double volume = (4.00/3.00) * 3.1416 * Math.pow(radious,3);

        if (radious <= 0 ) {
            System.out.println("Radious must be positive numbers.");
        } else {
            System.out.printf("The volume of ball: %.2f%n", volume);
        }



    }
}