//Reverse a given series. Use Arrays and loops


package task2;

import java.util.Arrays;

public class ReverseSeries {
    public static void main(String[] args) {
        int[] series = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // given series

        System.out.println("Original Series: " + Arrays.toString(series));

        reverseArray(series);

        System.out.println("Reversed Series: " + Arrays.toString(series));
        /*
        * Arrays.toString(series) is a method from the java.util.Arrays class that converts an array
        into a string representation.
        # How it Works:
        When you pass an array to Arrays.toString(), it:
                 1. Loops through each element in the array.
                 2. Formats the elements into a string, enclosed in square brackets ([]).
                 3. Separates each element with a comma and space (, ).
                 4. Returns the formatted string.
        * */
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];  // Swap elements
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
