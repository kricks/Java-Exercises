import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Get user input to create array
        int[] myArray = new int[5];
        System.out.println("Please enter 5 values: ");
        for (int i = 0; i < 5; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.print("Values are: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n" + "Enter index to print value: ");
        int value = scan.nextInt();
        int element = (int) Array.get(myArray, value);
        for (int i = 0; i <=0; i++) {
            System.out.print("The " + value + " index has the value of " + element);
        }
    }
}
