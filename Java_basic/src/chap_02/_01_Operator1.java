package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 일반 연산

        // 사칙연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2

        // 실수와 정수를 나누면 결과는 실수이다.
        System.out.println((float)5f / 2); // 2.5
        System.out.println((double)5 / 2); // 2.5
        System.out.println(5 / (double)2); // 2.5

        // 모듈러 연산자
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선순위 연산
        System.out.println((2 + 2) * 2); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        // 증강 연산 ++ --
        int val;
        val = 10;
        System.out.println(val); // 10
        val = val + 1;
        System.out.println(val); // 11
        val += 1;
        System.out.println(val); // 12
        System.out.println(val++); // 12
        System.out.println(val); // 13
        System.out.println(++val); // 14
        System.out.println(val); // 14

        // 전위 연산 예제 20 -> 30 -> 40 -> 50
        int[] array1 = {10, 20, 30, 40, 50};
        int i1 = 0;
        while (++i1 < array1.length) {
            System.out.println(array1[i1]);
        }
        // 후위 연산 예제 10 -> 20 -> 30 -> 40 -> 50
        int[] array2 = {10, 20, 30, 40, 50};
        int i2 = 0;
        do {
            System.out.println(array2[i2]);
        } while (i2++ < array2.length - 1);
    }
}
