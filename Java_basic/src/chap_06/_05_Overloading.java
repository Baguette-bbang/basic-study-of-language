package chap_06;

public class _05_Overloading {
    public static int getPower(int num) {
        return num*num;
    }
    public static int getPower(String strNumber) {
        int num = Integer.parseInt(strNumber);
        return num * num;
    }
    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * num;
        }
        return result;
    }
    public static int getPowerStr(String strNumber) {
        int num = Integer.parseInt(strNumber);
        return num * num;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 메소드 오버로딩은 같은 이름의 메소드를 여러 번 선언하는 것을 의미
        // 조건은
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 반환형은 상관없음. -> 반환형만 다르면 오버로딩 불가능함.
        System.out.println(getPower(3));
        System.out.println(getPowerStr("4"));
        System.out.println(getPower("5"));
        System.out.println(getPower(2,8));
    }
}
