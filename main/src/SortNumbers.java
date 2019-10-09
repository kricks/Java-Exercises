import java.util.Scanner;

/**
 * Sort through numbers, find smallest and print
 *
 * print promt "Input three numbers"
 * store input for each numbers
 * send values to sort method
 * print result
 *
 * sort (arg1, arg2, arg3)
 * determine whether
 *
 * @author  Katie R-P
 */
public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter second number: ");
        int num2= input.nextInt();

        System.out.print("Please enter third number: ");
        int num3 = input.nextInt();

        System.out.print("The lowest number is: " + sort(num1, num2, num3));
    }

    private static int sort(int num1, int num2, int num3) {
        int result = Math.min(Math.min(num1, num2), num3);
        return result;
    }
}
