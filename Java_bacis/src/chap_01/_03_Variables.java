package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 변수는 값을 저장하는 공간
        System.out.println("강영민님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println("강영민님, 배송이 완료되었습니다.");

        // 문자열형 변수 선언
        String name;
        // 변수값 할당
        name = "강영민";
        // 정수형 변수 선언 및 초기화
        int hour = 15;

        System.out.println(name+"님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name+"님, 배송이 완료되었습니다.");

        // 실수형 변수 선언 및 초기화
        double score = 90.5;
        // 한 글자시 작은따옴표
        char grade = 'A';
        name = "손수창";
        System.out.println(name+"님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        // boolean 변수 선언 및 초기화
        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // double에 비해 상대적으로 정밀도가 떨어지지만 실수값을 저장 가능한 float
        double d =3.14;
        // float f = 3.14; -> error 발생 뒤에 f를 붙여야 함.
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);
        System.out.println(d==f);

        // int i = 1000000000000; -> error 발생 정수 오버플로우
        // 약 -21억~21억 사이의 숫자 할당 가능함.
        int i = Integer.MAX_VALUE;
        System.out.println(i);

        // long 자료형
        long l_small = 1000000000000l;
        long l_large = 1000000000000L;

        System.out.println(l_small);
        // 같은 의미임 l,L
        System.out.println(l_small==l_large);

        // 숫자를 보기 쉽게 하는법
        long l = 1_000_000_000_000L;
        System.out.println(l);

        // 주요 자료형 : int, long, float, double, char, String, boolean
        // 용도에 맞는 자료형을 잘 활용하는것이 좋다.
        // 작은 범위의 계산에 굳이 큰 범위의 자료형을 쓰지말고 반대도 마찬가지이다.
    }
}
