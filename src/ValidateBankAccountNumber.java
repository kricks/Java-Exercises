import java.util.Scanner;

public class ValidateBankAccountNumber {

    private static class TestAccount {
        public TestAccount(String bankAccount) {

        }

        public boolean isRoutingNumberValid(String routeNum) {
            int modulus = 0;
            int length = routeNum.length();

            if (length != 9) {
                return false;
            } else {

                int sum1 = ((3 * (Integer.parseInt("" + routeNum.charAt(0)))) +
                        (7 * (Integer.parseInt("" + routeNum.charAt(1)))) +
                        ((Integer.parseInt("" + routeNum.charAt(2)))));

                int sum2 = ((3 * (Integer.parseInt("" + routeNum.charAt(3)))) +
                        (7 * (Integer.parseInt("" + routeNum.charAt(4)))) +
                        ((Integer.parseInt("" + routeNum.charAt(5)))));

                int sum3 = ((3 * (Integer.parseInt("" + routeNum.charAt(6)))) +
                        (7 * (Integer.parseInt("" + routeNum.charAt(7)))) +
                        ((Integer.parseInt("" + routeNum.charAt(8)))));

                int sum = sum1 + sum2 + sum3;

                modulus = sum % 10;

                if (modulus == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        public boolean isUserAccountValid(String accountNum) {
            int length = accountNum.length();
            if (length >= 5) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isValid(boolean routingNumberValid, boolean userAccountValid) {
            if(routingNumberValid == userAccountValid) {
                return true;
            } else {
                return false;
            }
        }

        public String sanitized(String routeNum, String accountNum) {
            String lastThreeDigits = accountNum;
            String sanAccNum = lastThreeDigits.substring(lastThreeDigits.length() - 3);

            System.out.println("Sanitized String: " + routeNum + "..." + sanAccNum);
            return lastThreeDigits;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter routing number: ");
        String routeNum = scan.next();

        System.out.print("Please enter account number: ");
        String accountNum = scan.next();

        String bankAccount = "1232719787826271889";

        TestAccount testAccount = new TestAccount(bankAccount);
        System.out.println("Is routing number valid: " + testAccount.isRoutingNumberValid(routeNum));

        System.out.println("Is user account valid: " + testAccount.isUserAccountValid(accountNum));

        System.out.println("Is valid: " +
                testAccount.isValid(testAccount.isRoutingNumberValid(routeNum), testAccount.isUserAccountValid(accountNum)));

        System.out.println("Account: " + testAccount.sanitized(routeNum, accountNum));
    }

}
