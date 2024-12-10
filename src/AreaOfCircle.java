import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the Radious:");

        float radious = myobj.nextFloat();

        double area = 3.1416 * Math.pow(radious,2);

        if (radious <= 0 ) {
            System.out.println("Radious must be positive numbers.");
        } else {
            System.out.printf("The area of circle: %.2f%n", area);
        }



    }
}
