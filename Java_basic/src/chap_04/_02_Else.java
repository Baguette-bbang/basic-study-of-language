package chap_04;

import java.sql.SQLOutput;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) { // 오후 2시 이전
            System.out.println("아이스 아메리카노 +1");
        } else { // 그 외의 경우
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");


    }

}
