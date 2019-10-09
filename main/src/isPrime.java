import java.util.Scanner;

public class isPrime {

    public static Boolean isPrime(int num) {
        int number = num;
        int temp;
        boolean isPrime = true;

        for (int i = 2; i < num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }

        return isPrime;
    }


    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Your number is " + num);
        System.out.println("Is given number a prime: " + isPrime(num));

    }
}
