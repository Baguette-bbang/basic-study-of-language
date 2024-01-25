package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10; // 오전 10시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        if (hour < 9)
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가"); // 출력이 됨.
        System.out.println("커피 주문 완료 #1");
        // Java에서 if문이나 for문과 같은 제어문을 사용할 때,
        // 중괄호 {} 없이는
        // 오직 바로 다음에 오는 하나의 명령어만 해당 제어문에 속하게 된다.

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우는?
        hour = 14;
        boolean morningCoffee = false;
        if (hour < 15 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        if (hour < 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
