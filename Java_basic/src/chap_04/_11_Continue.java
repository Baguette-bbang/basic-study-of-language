package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님 중 노쇼 소님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
            if (i == noShow) {
                System.out.println("17번 손님은 노쇼입니다.");
                continue;
            }
            sold++;
            if (sold==max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        // While 문
        int idx = 0;
        sold = 0;
        while (idx < 50) {
            idx ++;
            System.out.println(idx + "번 손님 주문하신 치킨 나왔습니다.");

            if (idx == noShow) {
                System.out.println(idx + "번 손님은 노쇼입니다.");
                continue;
            }
            sold ++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
    }
}
