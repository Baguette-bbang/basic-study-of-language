package chap_07;
import chap_07.BlackBoxRefurbish;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
         // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        // 범위 설정
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));
        // 랜덤 실수 (0.0 이상 ~1.0 미만)
        System.out.println("랜덤 실수 : " + random.nextDouble());
        // 랜덤 실수 범위 설정은 불가능함.
        // System.out.println("랜덤 실수 (범위) : " + random .nextDouble(10.0)); // 정수와 다르게 불가능

        double min = 0.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
