import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringRegexExample {
    public static void main(String[] args) {
        String text = "Hello, World!";

        // matches() - 전체 문자열 매칭
        boolean matches = text.matches("Hello.*");

        // replaceAll () - 패턴에 매칭되는 모든 부분 치환
        String replaced = text.replaceAll("\\w+","word");

        // split() - 패턴을 기준으로 문자열 분리
        String numbers = "1,2,3;4:5";
        String[] parts = numbers.split("[,;:]");

    }
}
