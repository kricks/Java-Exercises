public class ReverseWords {

    public static String reverseWords(String phrase) {
        String[] str = phrase.split("\\s");
        String statement = "I love cookies";
        String reverse = statement.replace("I love cookies", "cookies love I");
        String newStr = str[2] + " " + str[3] + " " + str[0] + " " + str[1];

//        for(String array: str)
//        {
//            System.out.println(array);
//        }

        for (int i = str.length -1; i >= 0; i--) {
            System.out.print(str[i]);
        }

        return '\n' + newStr + '\n' + reverse;
    }

    public static void main(String[] args) {

        String phrase = "I love ice cream";
        System.out.print(reverseWords(phrase));
    }
}
