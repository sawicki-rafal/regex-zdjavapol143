package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

    private final Pattern pattern;

    public RegexTester(String patternAsString) {
        this.pattern = Pattern.compile(patternAsString);
    }

    public void validate(String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }

}
