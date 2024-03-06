package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        converter.convert(2);
        // 위의 동작과 같음
        // Convertible converter 를 (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원") 으로 대치해보림.
        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 3);

        // 함수형 인터페이스로서 관리하면 더 깔끔함.
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 4);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
          int USD = 5;
          int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> {
            System.out.println(d + " 달러 = " + (d * w) + " 원");
        };
        c2.convert(6, 1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) -> d*w;
        System.out.println(7 + " 달러 = " + c3.convert(7, 1400) + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

