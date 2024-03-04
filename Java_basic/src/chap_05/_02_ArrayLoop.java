package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees4= {"Americano", "Cafemocha", "Latte", "Cappuccino"};

        // 커피 주문
        for (int i=0; i < coffees4.length; i++) {
            System.out.println(coffees4[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("-----------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees4) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("-----------------");
    }
}

