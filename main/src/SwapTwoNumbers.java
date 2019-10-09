/*
parameters: 2 numbers, num x = 1, num y = 2, num temp;
num y = x
num temp = y;
num x = temp;
 */

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int first, second, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for first and second numbers: ");
        first = input.nextInt();
        second = input.nextInt();

        System.out.println("Before switch: First = " + first + ", "
                + "Second = " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After switch : First = " + first + ", "
                + "Second = " + second);

//        temp = first;
//        first = second;
//        second = temp;
//        System.out.println("After switch with 3rd var: First = " + first + ", "
//                + "Second = " + second);



    }
}
