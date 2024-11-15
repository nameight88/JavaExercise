import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexExceptionHandling {
    public static boolean validatePattern(String text, String regex) {
        try {
            Pattern.compile(regex);
            return text.matches(regex);
        } catch (PatternSyntaxException e) {
            System.err.println("Invalid regex pattern: " + e.getMessage());
            return false;
        }
    }
}