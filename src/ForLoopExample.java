/**
 * A for loop is used when you want to specify how many times the loop iterates through a block of code.
 * The basic structure of a for loop is:
 *
 * for ( initial action; loop-continuation-condition; action-after-each-iteration ) {
 * 	// place code here
 * }
 *
 * The initial action is initializing the control variable. In my example below, I am setting i to equal zero.
 *
 * The second statement is where I am specifying how many time I want to iterate. I want to print hello world 5 times.
 * So I am saying that I want i to be evaluated less than 5
 *
 * The third statement is what adjusts the control variable, since is it i++ it is a post increment.
 * In the example, i increments like 0, 1, 2, 3, 4, thus printing Hello World 5 times.
 *
 * @author  Katie R-P
 */

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}
