package Kiemtracuoikijava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validate {
    public static final Pattern EmailRegex = Pattern.compile(
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
        Pattern.CASE_INSENSITIVE);


    public static final Pattern PasswordRegex = Pattern.compile("^(?=.*[A-Z])(?=.*[@#$%^&+=]).*.{7,15}$",Pattern.CASE_INSENSITIVE);
   

public static String validateEmail(String email) {
    Matcher matcher = EmailRegex.matcher(email);
    if (matcher.find()) {
        return email;
    } else {
        throw new RuntimeException("Email không hợp lệ.");
    }
}

public static String validatePassword(String password){
    
    //Check password, password cần chứa 7 ký tự đến 15 ký tự
    //password chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)
    
    Matcher matcher = PasswordRegex.matcher(password);
    
    if (matcher.find()) {
        return password;
    } else { 
        throw new RuntimeException("Password không hợp lệ");
    }
    
}
}
