package chap_09;

import chap_09.User.User;
import chap_09.User.VIPUser;
import chap_09.coffee.*;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("나는점원이고너는손님");
        c2.ready();
        // 여기서 비효율적이라는 사실을 깨달을 수 있다.
        // 타입만 다르고 반환하는 내용은 같은데 매번 클래스를 다시 만들어줘야하는 것이 매우 번거롭다.
        // 일단 Object 타입으로 해결가능할 듯 하다.
        System.out.println("-----------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("헬로바이든트럼프");
        c4.ready();

        // Object를 활용하여 일단 어떻게든 해결하였다.
        System.out.println("-----------------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);
        // 여전히 형변환을 해야하며 타입이 실행하기 전까지 오류인줄 모르고 실행한다.
        // 이때 제네릭 클래스를 생성하는 것이다.
        System.out.println("-----------------------");
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("헬로윤석열문재인");
        c6.ready();
        System.out.println("주문 고객 이름 : " + c6.name);

        System.out.println("-----------------------");

        // 사용자 정보 클래스를 만들기
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("경찰청철창살"));
        c7.ready();

        CoffeeByUser<VIPUser> c8 = new CoffeeByUser<VIPUser>(new VIPUser("저도한입만요"));
        c8.ready();

        System.out.println("-----------------------");
        orderCoffee("헤이거기");
        orderCoffee(36);

        orderCoffee(37, "라떼");
        orderCoffee("숨겨왔던 나의", "아메리카노");
    }
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}