/*
Remove white spaces.
How will i find whitespace?
    detect whitespace or set a value to whiteSpace = " ";
what java method could i use? find method? contains()?,
only works for array

once i remove white space, I need a new string to be the updated no whitespace
look at each element in the string
 */

public class RemoveWhiteSpace {

    public static StringBuilder removeWhiteSpace(String phrase) {

        // turns string phrase into char array
        char[] chars = phrase.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        String phrase = "Hello World KT!";

        System.out.print(removeWhiteSpace(phrase));
    }
}
