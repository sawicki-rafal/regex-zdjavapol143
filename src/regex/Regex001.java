package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex, który sprawdza polskie numery telefonów komórkowych,
zaczynające się cyfrą 5.
Uwzględniaj, że na początku może (ale nie musi) wystąpić +48
 */
public class Regex001 {
    private static final Pattern PATTERN = Pattern.compile("(\\+48)?5[0-9]{8}");

    public static void main(String[] args) {
        validate("+48515123456"); //true
        validate("+48715123456"); //false
        validate("515332123");
        validate("515336293");
        validate("415336293");
        validate("615332123");
        validate("715332123");
        validate("712123");
        validate("51123");
    }

    public static void validate(String text){
        Matcher matcher = PATTERN.matcher(text);
        if(matcher.matches()){
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }
}

