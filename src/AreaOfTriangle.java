import java.util.Scanner; // Import Scanner class

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter the Height and Base separated by a space: ");

        float height = myObj.nextFloat(); // Read height
        float base = myObj.nextFloat();   // Read base


        if (height <= 0 || base <= 0) {
            System.out.println("Height and Base must be positive numbers.");
        } else {
            System.out.printf("The Area of Triangle: %.2f%n", 0.5 * height * base);
        }
    }
}
