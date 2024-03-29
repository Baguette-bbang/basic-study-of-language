package chap_04;

import java.sql.SQLOutput;

public class _10_Break {
    public static void main(String[] args) {
        // break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)

        // For 문
        int max = 20;
        for (int i=1; i<=50; i++) {
            System.out.println(i+ "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

        // While 문
        int idx = 1; // 손님 대기 번호
        while (idx <= 50) {
            System.out.println(idx + "번 손님, 주문하신 치킨 나왔습니다.");

            if (idx == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            idx += 1;
        }
    }

}
