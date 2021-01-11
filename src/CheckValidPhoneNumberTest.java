public class CheckValidPhoneNumberTest {
    public static void main(String[] args) {
        CheckValidPhoneNumber checkValidPhoneNumber = new CheckValidPhoneNumber();
        String test = "(84)-(0355261293)";

        System.out.println(test + " is valid "+  checkValidPhoneNumber.check(test));
    }
}
