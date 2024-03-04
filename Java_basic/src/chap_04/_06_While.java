package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 명확한 횟수가 없는 경우 while문을 사용한다.
        // 반복문 While
        // 수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0;
        // while (조건)
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 게속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다. ");

        // 무한 루프

    }
}
