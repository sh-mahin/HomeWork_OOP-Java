package task2;

public class ForLoopSeries {
    public static void main(String[] args) {
        System.out.print("Even Series: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nOdd Series: ");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}
