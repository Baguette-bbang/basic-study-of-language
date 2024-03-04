package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";
        // KR_COUNTRY_CODE = "+8282"; -> 상수는 변경이 안되기에 에러남.
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        // 상수는 Camel case가 아니라 Upper case로 작성
        final String DATE_OF_BIRTH = "2000-03-12";
        // 1:37:10
    }
}
