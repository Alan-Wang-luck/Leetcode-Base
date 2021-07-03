import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckMail {
    public static void main(String[] args) {
        String email = "wsy20030518@163.com";
        System.out.println(checkmail(email));

    }
    public static boolean checkmail(String email){
        String regExp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
