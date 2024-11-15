import java.util.regex.Pattern;

public class RegexUtils {
    private static final Pattern EMAIL = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern PHONE = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");

    // 이메일 검증
    public static boolean isValidEmail(String email) {
        return email != null && EMAIL.matcher(email).matches();
    }

    // 전화번호 검증
    public static boolean isValidPhone(String phone) {
        return phone != null && PHONE.matcher(phone).matches();
    }

    // 특수문자 제거
    public static String removeSpecialCharacters(String text) {
        return text.replaceAll("[^a-zA-Z0-9가-힣\\s]", "");
    }

    // HTML 태그 제거
    public static String removeHtmlTags(String html) {
        return html.replaceAll("<[^>]*>", "");
    }
}