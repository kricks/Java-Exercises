/*
Parameters:
- expected input
- expected output
This could involve test cases like Junit
edge cases:

for (set i to 1, I want to count up to 50, i <= 50; post increment)
inside for loop: I want three if statements
if (i % 3 == 0)
else if (i % 5 ==0)
else if (i% 5 || i %3)
 */

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of 1 to 50: ");
        int num = input.nextInt();

        for(int i = 1; i <= 50; i++) {
            if (i % (3*5) == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
