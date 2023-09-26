package regex;

/*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra = [0-9]
    \\D - jakikolwiek znak, który nie jest cyfrą
    \\w - znak używany w słowach(word) = [a-zA-Z0-9_]
    \\W - jakikolwiek znak, który nie jest używany w słowach
            (zaprzeczenie tego powyżej)
    \\s - tzw białe znaki, czyli znak spacji, tabulacji itp.
            [ \t\n\r\f\x0B]
         znaki, które są niewidoczne podczas wydruku
 */

public class RegexExample {
    public static void main(String[] args) {
        //czterocyfrowa liczba
        String yearPattern = "\\d{4}";
        RegexTester tester = new RegexTester(yearPattern);
        tester.validate("1984");
        tester.validate("2023");
        tester.validate("2023123");
        tester.validate("202");
        tester.validate("2");

        RegexTester t = new RegexTester("\\d\\w\\d");
        t.validate("1_6");
        t.validate("0X4");
        t.validate("a7b");
        t.validate("0 3");

    }
}
