import java.util.Scanner;

public class ReverseString {

    public static String iteration(String phrase) {
        String reverse = " ";
        for (int i = phrase.length() - 1; i >= 0; i--){
            reverse = reverse + phrase.charAt(i);
        }
        return reverse;
    }

    public static StringBuilder withStringBuilder(String phrase) {
        StringBuilder str = new StringBuilder();
        str.append(phrase);
        str = str.reverse();;

        return str;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string to reverse: ");

        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();

        System.out.println("The reverse string using iteration is: " + iteration(phrase));
        System.out.println("The reverse string using StringBuilder is: " + withStringBuilder(phrase));
    }
}
