package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스번호는 숫자와 문자가 섞여 있을 수도 있음.
        String bus = "관악01";
        int minute = 3;
        float distance = 1.5f;

        System.out.println(bus + "번 버스");
        System.out.println("약 "+ minute+"분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
