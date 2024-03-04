package chap_04;

import java.sql.SQLOutput;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // for(선언;조건;증감)
        for(int i = 1; i < 11; i++) {
            System.out.println("어서 오세요. " + i + "번째 인사 중..");
        }

        // 홀수만 출력해보자.
        for(int i = 1; i < 10; i+=2) {
            System.out.println("홀수만 출력 중.. " + i + "..");
        }

        // 거꾸로 출력해보자.
        for(int i = 10; i > 0; i--) {
            System.out.println("거꾸로 출력 중.. " + i +"..");
        }

        // 순차적 합을 해보자.
        int sum = 0;
        for (int i = 0; i < 11; i++){
            sum += i;
            System.out.println("1~10까지 순차적 합을 하는중.. sum : " + sum + "..");
        }
        System.out.println("최종 결과.. : " + sum);
    }
}
