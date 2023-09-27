package examples;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("982193423742164762784");
        BigDecimal bd2 = new BigDecimal("982193423742164762784");

        BigDecimal result = bd1.add(bd2);
        System.out.println(result);
        System.out.println(Long.MAX_VALUE);

        BigDecimal bd3 = new BigDecimal("0.1");
        System.out.println(bd3);
        System.out.println(bd3.add(bd3));
        System.out.println(bd3.add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
        System.out.println(bd3.add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3).add(bd3));
    }
}
