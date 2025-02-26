package task2;

import java.util.Scanner;

class CountOccurrenceOfChar {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.nextLine();

        System.out.print("Enter the character to count: ");
        char ch = input.next().charAt(0);  // Read the first character input

        // Count occurrences of 'ch' in 'str'
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + ch + "' in the string: " + count);
    }
}
