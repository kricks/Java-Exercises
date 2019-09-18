/**
 * for-each loop is also known as the Enhanced Loop
 * This loop is used to iterate through arrays or collections
 * It iterates through each element of the array or collection
 *
 * The syntax is:
 * for (type var: array) {
 *     statements using var;
 * }
 *
 * The for-each is easier to write and read
 * It does not require a counter like the for loop
 *
 * The example below iterates through the array and prints out each value
 *
 * @author  Katie R-P
 */

public class ForEachExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
