import java.util.regex.Matcher;
import java.util.regex.Pattern;
//^\(\d{3}\)\s\d{3}-\d{4}
//        (xx)-(0xxxxxxxxx)
//^\(\d{2}\)\-(\0d{9}\)\$
public class CheckValidPhoneNumber {
    private final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    private final String PHONE_NUMBER_REGEX1 = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public CheckValidPhoneNumber() {
    }

    public boolean check(String s) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX1);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

}
