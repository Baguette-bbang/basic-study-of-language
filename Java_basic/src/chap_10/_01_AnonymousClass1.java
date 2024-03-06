package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스 -> 이름이 없는 클래스를 의미한다.
        // 클래스 안에도 클래스를 만들 수 있다.
        // 이것을 내부 클래스라고 하는데 그 중 특별한 클래스가 하나 있는데
        // 이것을 익명 클래스라고 부른다.
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("--------------------");
        Coffee c2 = new Coffee();
        c2.order("카푸치노");

        System.out.println("--------------------");
        // 굉장히 친한 친구 방문 -> 주문한 커피말고도 다른 것도 챙겨주고 싶음.
        // 중간에 어떤 동작을 정의 가능하다.
        Coffee specialCoffee = new Coffee() {
            @Override // 기능확장 일회용으로 사용할 때
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말로) 딸기 케이크는 서비스 입니다.");
            }
            public void returnTray() {
                System.out.println("(귓속말로) 자리에 두시면 제가 치우겠습니다요.");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();


    }
}
class Coffee {
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("반납이 완료되었습니다요.");
    }
}


