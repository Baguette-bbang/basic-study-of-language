package chap_06;

public class _01_Method {
    public static void sayHello() {
        System.out.println("안녕하시렵니까? 메소드입니다만?");
    }
    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
