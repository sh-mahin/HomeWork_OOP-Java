package task1;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the Celsius Temperature:");

        float celsius = myobj.nextFloat();

        double Fahrenheit =  ((9 * celsius)/ 5 ) + 32;


            System.out.printf("The temperature in Fahrenheit scale is: %.2f%n",Fahrenheit );


    }

}
