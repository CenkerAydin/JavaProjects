import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //**5.33 (Perfect number) A positive integer is called a perfect number if it is equal to
        //the sum of all of its positive divisors, excluding itself. For example, 6 is the first
        //perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
        //+ 1.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the bound:");
        int bound = input.nextInt();
        int sum;    // Holds the sum of the positive divisors
        // Find all perfect numbers less than 10,000
        for (int i = 1; i <= bound; i++) {
            sum = 0;    // Reset Accumulator to 0

            for (int k = 1; k < i; k++) {
                // Test for divisor
                if (i % k == 0)
                    sum += k;
            }
            // Test if sum of all positive divisors are equal to number
            if (i == sum)
                System.out.printf("%2d\n", i);
        }
    }
}
