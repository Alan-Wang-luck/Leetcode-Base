import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void main(String[] args) {
        String phone = "15710571975";
        String email = "wsy20030518@1163.com";
        System.out.println(isMobilePhoneLegal(phone));
        System.out.println(checkmail(email));

    }

    public static boolean isMobilePhoneLegal(String str) {
        String regExp = "^((13[0-9])|(15[0-9])|(17[0-9])|(18[0-9]))\\d{8}$";
        if (str.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regExp);
            Matcher m = p.matcher(str);
            return m.matches();
        }
    }

    public static boolean checkmail(String email) {
        String regExp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(email);
        return m.matches();
    }

}
