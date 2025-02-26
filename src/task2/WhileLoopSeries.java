package task2;

public class WhileLoopSeries {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Even Series: ");
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }

        int j = 1;
        System.out.print("\nOdd Series: ");
        while (j < 20) {
            System.out.print(j + " ");
            j += 2;
        }
    }
}
