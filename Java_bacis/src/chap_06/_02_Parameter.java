package chap_06;

public class _02_Parameter {
    public static void power(int num) {
        System.out.println(num+"의 제곱은 " + num*num);
    }

    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * num;
        }
        System.out.println(num + " 의 " + exp + " 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        // 제곱 메소드 정의
        for (int i = 0; i < 10; i++) {
            power(i);
            powerByExp(i,i);
        }

    }
}
