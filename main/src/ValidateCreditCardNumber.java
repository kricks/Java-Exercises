import java.util.Scanner;

public class ValidateCreditCardNumber {

    private static class TestCard {
        public TestCard(String cardNumber) {

        }

        // only amex, master, and visa
        public static boolean isValid(String cardNum) {

            int number = Integer.parseInt(String.valueOf(cardNum.length()));
            if (!(number == 16 || number == 15 || number == 13)) {
                return false;
            } else {
                // convert input to int
                int[] creditCardNum = new int[cardNum.length()];

                for (int i = 0; i < cardNum.length(); i++) {
                    creditCardNum[i] = Integer.parseInt(cardNum.substring(i, i + 1));
                }

                // reverse array, every other number * 2
                for (int i = creditCardNum.length - 2; i >= 0; i = i - 2) {
                    int tempVal = creditCardNum[i];
                    tempVal = tempVal * 2;

                    // make sure that a digit is not above 9.
                    if (tempVal > 9) {
                        tempVal = tempVal % 10 + 1;
                    }
                    creditCardNum[i] = tempVal;
                }
                // add digits
                int total = 0;
                for (int i = 0; i < creditCardNum.length; i++) {
                    total += creditCardNum[i];
                }

                // if creditCardNum is multiple of 10, return true, is valid
                if (total % 10 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        public String cardType(String cardNum) {
            String cardType;
            if (cardNum.startsWith("4")) {
                cardType = "Visa";
            } else if (cardNum.startsWith("5")){
                cardType = "MasterCard";
            } else if (cardNum.startsWith("34")) {
                cardType = "American Express";
            } else if (cardNum.startsWith("37")) {
                cardType = "American Express";
            } else {
                cardType = "Invalid Card";
            }
            return cardType;
        }

        public String sanitized(String cardNum) {
            String firstFour = cardNum.substring(0, 4);
            String lastFour = cardNum.substring(cardNum.length() - 4);

            System.out.println("Sanatized CardNumber: " + firstFour+ "..." + lastFour);
            return cardNum;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter card number: ");
        String cardNum = input.next();
        String cardType = "";

        String cardNumber = "555555555554444";
        TestCard testCard = new TestCard(cardNumber);
        System.out.println("Is Valid: " + testCard.isValid(cardNum));
        System.out.println("Type: " + testCard.cardType(cardNum));
        System.out.println("Number: " + testCard.sanitized(cardNum));
    }


}
