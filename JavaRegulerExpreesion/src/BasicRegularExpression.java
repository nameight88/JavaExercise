import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegularExpression {

    public class RegexBasics {
        // 1. 기본 문자 클래스
        private final String[] PATTERNS = {
                "\\d",    // 숫자 [0-9]
                "\\w",    // 단어 문자 [a-zA-Z0-9_]
                "\\s",    // 공백 문자
                ".",     // 모든 문자
                "^",      // 문자열 시작
                "$",      // 문자열 끝
        };

        // 2. 수량자
        private final String[] QUANTIFIERS = {
                "*",      // 0회 이상
                "+",      // 1회 이상
                "?",      // 0회 또는 1회
                "{n}",    // 정확히 n회
                "{n,}",   // n회 이상
                "{n,m}",  // n회 이상 m회 이하
        };
    }

    public class CommonPatterns {
        // 기본 검증 패턴
        private final Pattern EMAIL =
                Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        private final Pattern PHONE =
                Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
        private final Pattern DATE =
                Pattern.compile("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
        private final Pattern PASSWORD =
                Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
        private final Pattern IP_ADDRESS =
                Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }
    public static void main(String[] args) {
        // Pattern 클래스를 이용
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher("test@email.com");
        boolean matches = matcher.matches();// 전체 문자열 매칭

        // Matcher 클래스의 주요 메서드들
        String text = "Contact: test@email.com, admin@email.com";
        pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: +" + matcher.group());
            System.out.println("Start: +"+ matcher.start());
            System.out.println("End: +"+matcher.end());
        }
    }
}
