package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하라.
        String rrn = "000312-3456789";
        System.out.println(rrn.substring(0,8));

        String rrn2 = "901231-1234567";
        System.out.println(rrn2.substring(0, rrn2.indexOf("-")+2)); // 하이픈을 찾고 하이픈 포함 다음문자까지 출력

        System.out.println(rrn.equals(rrn2)); // false
    }
}
