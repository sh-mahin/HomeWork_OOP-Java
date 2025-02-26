package task2;

public class DoWhileLoopSeries {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Even Series: ");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);

        int j = 1;
        System.out.print("\nOdd Series: ");
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j < 20);
    }
}
