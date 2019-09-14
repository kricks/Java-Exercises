import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a string to reverse: ");

        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        String reverse = " ";

        for (int i = phrase.length() - 1; i >= 0; i--){
            reverse = reverse + phrase.charAt(i);
        }

        System.out.println("The reverse string is: " + reverse);
    }
}
