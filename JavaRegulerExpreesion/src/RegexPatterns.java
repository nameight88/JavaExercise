import java.util.regex.Pattern;

public class RegexPatterns {
    // 정규식 패턴들 예시
    public static final String EMAIL_PATTERN =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static final String PHONE_PATTERN ="" +
            "^\\d{2,3}-\\d{3,4}-\\d{4}$";
    public static final String PASSWORD_PATTERN =
            "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

    // Pattern 객체 캐싱
    private static final Pattern EMAIL_VALIDATOR =
            Pattern.compile(EMAIL_PATTERN);
    private static final Pattern PHONE_VALIDATOR =
            Pattern.compile(PHONE_PATTERN);
    // 유효성 검증
    public static boolean isValidEmail(String email){
        return email != null && EMAIL_VALIDATOR.matcher(email).matches();
    }
    public static boolean isValidPhone(String phone){
        return phone != null && PHONE_VALIDATOR.matcher(phone).matches();
    }
}
