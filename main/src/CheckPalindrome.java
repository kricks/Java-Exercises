import java.util.Scanner;

/**
 * Prompt user for input
 * Check input to see if palindrome
 *
 * @author Katie R-P
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = input.nextLine();

        int low = 0;
        int high = word.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (word.charAt(low) != word.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;

        }
        if (isPalindrome) {
            System.out.print(word + " is a palindrome");
        } else
            System.out.print(word + " is not a palindrome");
    }
}
