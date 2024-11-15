import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUsageCase {
    public static void main(String[] args) {
        String text = "Hello, my email is test@example.com";

        // 1. Pattern과 Matcher 사용
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
        }

        // 2. String 클래스 메서드 사용
        boolean matches = text.matches(".*@.*");
        String replaced = text.replaceAll("\\w+@\\w+\\.\\w+", "EMAIL");
        String[] parts = text.split("\\s+");
    }
}