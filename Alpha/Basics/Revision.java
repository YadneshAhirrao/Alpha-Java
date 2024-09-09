import java.util.*;

public class Revision {
    public static void main(String[] args) {
        int number = 43018;
        printBreakdown(number);
    }

    public static void printBreakdown(int number) {
        // Find the highest place value (10^x) less than or equal to the number
        int divisor = 1;
        while (divisor <= number) {
            divisor *= 10;
        }
        divisor /= 10;

        // Iterate through the number using the place value
        boolean first = true;
        while (divisor > 0) {
            int digit = number / divisor;
            if (digit != 0) {
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(digit * divisor);
                first = false;
            }
            number %= divisor; // Remove the processed digit
            divisor /= 10;      // Move to the next lower place value
        }

        System.out.println(); // Move to the next line after printing the breakdown
    }
}
