package chap_05;

public class _01_Arrary {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 배열 선언 첫 번째 방법
        String[] coffees1 = new String[4];

        // 배열 선언 두 번째 방법
        String coffees2[] = new String[4];

        coffees1[0] = "Americano";
        coffees1[1] = "Cafemocha";
        coffees1[2] = "Latte";
        coffees1[3] = "Cappuccino";

        // 세 번째 방법 선언과 동시에 초기화
        String[] coffees3 = new String[] {"Americano", "Cafemocha", "Latte", "Cappuccino"};

        // 네 번째 방법
        String[] coffees4= {"Americano", "Cafemocha", "Latte", "Cappuccino"};
    }
}
