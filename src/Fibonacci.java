import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a given number of Fibonacci series to print: ");

        int number = new Scanner(System.in).nextInt();

        System.out.println("The Fibonacci Series: ");

        for (int i = 1; i <= number; i++) {
            System.out.println(fib(i) + " ");
        }
    }

    // with recursion
    public static int fib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fib(number-1)  + fib(number-2);
    }

    // with iteration
//    public static int fib2(int number){
//        if(number == 1 || number == 2) {
//            return 1;
//        }
//        int a =1, b = 1, sum = 1;
//
//        for(int i = 3; i <= number; i++){
//            sum = a + b;
//            a = b;
//            b = sum;
//        }
//
//        return sum;
//    }


}