import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = input.nextInt();

        String gpa;

        if (score < 0 || score > 100) {
            gpa = "Invalid score";
        } else {
            gpa = switch (score / 10) {
                case 10, 9 -> "A+";
                case 8 -> "A";
                case 7 -> "A-";
                case 6 -> "B";
                case 5, 4 -> "C+";
                default -> "F";
            };
        }

        System.out.println("The GPA is: " + gpa);

    }
}
