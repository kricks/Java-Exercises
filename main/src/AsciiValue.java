import java.util.Scanner;

/**
 * Simple exercise printing ascii of character
 *
 * @author  Katie R-P
 */

public class AsciiValue {
    public static void main(String[] args) {
        System.out.print("Please enter character to see ascii value: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.next().charAt(0);
        System.out.println("The ascii value of is " + value);
    }
}
