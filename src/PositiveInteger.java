import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    int num = input.nextInt();

    if(num > 0){
        System.out.println("Number is a positive integer.");
    }
    else {
        System.out.println("Number is not a positive integer.");
    }
}
}


