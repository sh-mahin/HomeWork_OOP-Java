import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the value arms of Triangle:");
        float arm = myObj.nextFloat();
        double area = (Math.sqrt(3))/4 * (Math.pow(arm, 2));

        System.out.printf("the area of a equilateral triangle is: %.2f%n", area);
    }
}