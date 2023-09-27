package examples;

/*
%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
 */
public class PrintfTest {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("Wynik to: %d %d", x, -x);

        System.out.println();
        System.out.println();

        float y = 2.28f;
        System.out.printf("Z dokładnością do 4 miejsc po przecinku: %.4f \n", y);

        float z = 3.12312345f;
        System.out.printf("Z dokładnością do 2 miejsc po przecinku: %.2f \n", z);

        System.out.println();
        System.out.println();

        //całość ma zająć 5 znaków
        //chyba że część przed przecinkiem się nie mieści to wtedy nie
        System.out.printf("#%5.2f#\n", 2.28);
        System.out.printf("#%5.2f#\n", 2.28567890);
        System.out.printf("#%5.2f#\n", 2345345.123);

        System.out.println();
        System.out.println();

        System.out.printf("#%010.2f#  \n",2.28);
    }
}
