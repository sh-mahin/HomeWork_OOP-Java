package task3;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

