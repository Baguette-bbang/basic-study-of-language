package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        move = 0;
        height = 25;
        while (move + height < distance) { // 조건에 부합되지 않기에 while문에 들어가지도 않게 됨.
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        // 반드시 한번은 돌려야할 경우.
        // Do While 반복문
        // do {
        //
        // } while (조건);
        do {
            System.out.println("빌차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        } while (move+height < distance);
        System.out.println("도착했습니다.");
    }
}
