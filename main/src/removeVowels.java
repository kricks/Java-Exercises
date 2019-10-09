public class removeVowels {

    public removeVowels(String phrase) {
        // string builder is string objects that can be modified
        StringBuilder result = new StringBuilder();
       char[] chars = phrase.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           char chr = chars[i];
           if (!isVowel(chr))
               result.append(chr);
       }
       System.out.print("Updated String: " + result);
    }

    public boolean isVowel(char chr) {
        String vowels = "AEIOUaeiou";
        if(vowels.contains(chr + "")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String phrase = "Hello Word";
        System.out.println("String with vowels: " + phrase);
        new removeVowels(phrase);
    }
}
