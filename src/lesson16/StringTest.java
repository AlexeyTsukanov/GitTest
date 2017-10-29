package lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {
        String stringRattern= "[Java\\s+\\d]";
        String str = "Version Java 5, Java  6, Java 7, Java   8";
        Pattern pattern = Pattern.compile(stringRattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}
