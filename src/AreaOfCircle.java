import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the Radius:");

        float radius = myobj.nextFloat();

        double area = 3.1416 * Math.pow(radius,2);

        if (radius <= 0 ) {
            System.out.println("Radius must be positive numbers.");
        } else {
            System.out.printf("The area of circle: %.2f%n", area);
        }



    }
}
