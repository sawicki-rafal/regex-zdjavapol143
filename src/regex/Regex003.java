package regex;
/*
Napisz 2 regexy:
1 - > sprawdza poprawność imienia
2 - > sprawdza poprawność nazwiska
(weź pod uwagę nazwiska wieloczłonowe) //bez polskich znakow
np. Bachleda-Curus, von der Leyen, de Silva

 */
public class Regex003 {
    public static void main(String[] args) {
        RegexTester firstnameTester = new RegexTester("[A-Z][a-z]+");
        firstnameTester.validate("Urszula");
        firstnameTester.validate("Tomek");
        firstnameTester.validate("Janusz");
        firstnameTester.validate("Janusz");

        RegexTester surnameTester = new RegexTester("[a-zA-Z]+(['\\- ][a-zA-Z]+)*");
        //true
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        //surnameTester.validate("Bachleda Curus");??
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("O'Haara");

        //false
        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("de 12312-3123");
        surnameTester.validate("!@$$:");
        surnameTester.validate("Kowalska-");
        surnameTester.validate("Kowalska ");
        surnameTester.validate("-Nowak");
        //tu sie wywala
        surnameTester.validate("kowalski");
        surnameTester.validate("Bachleda--Curus");
        surnameTester.validate("O''Haara");
    }
}
