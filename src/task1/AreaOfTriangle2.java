package task1;

import java.util.Scanner;

public class AreaOfTriangle2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle: ");
        float arm1 = myObj.nextFloat();
        float arm2 = myObj.nextFloat();
        float arm3 = myObj.nextFloat();

        if (arm1 <= 0 || arm2 <= 0 || arm3 <= 0) {
            System.out.println("Sides must be positive numbers.");
        } else if (arm1 + arm2 <= arm3 || arm1 + arm3 <= arm2 || arm2 + arm3 <= arm1) {
            System.out.println("The given sides do not form a valid triangle.");
        } else {
            float s = (arm1 + arm2 + arm3) / 2;
            double area = Math.sqrt(s * (s - arm1) * (s - arm2) * (s - arm3));
            System.out.printf("The Area of Triangle: %.2f%n", area);
        }
    }
}
