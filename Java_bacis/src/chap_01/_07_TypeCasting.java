package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int score = 93 + 98.8;
        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 93.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 93

        // 정수 + 실수 연산
        score = 93 + (int)93.8;
        System.out.println(score);

        score_f = (float)93 + 93.8F;
        System.out.println(score_f);

        score_d = (double)93 + 93.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        // 정수형 변수를 double 형 변수에 대입했음에도 에러가 없음.
        // 자동으로 double 형 변수로 변환됨.
        // float도 동일함.
        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);

        float convertedScoreFloat = score;
        System.out.println(convertedScoreFloat);

        // 하지만 실수형을 정수형으로 변환하는 과정에서는 에러가 발생
        // 소수점에 해당되는 숫자는 제거되기에 에러가 발생됨.
        // 때문에 앞에서 형변환하는 과정이 필요함.
        int convertedScoreInt = (int)score_d;
        System.out.println(convertedScoreInt);

        // 즉, 더 작은 범위의 형변환을 할 때 반드시 수동적으로 형변환하는 과정이 필요함.
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로 변환
        // String s1 = 93;
        // 위 작업은 클래스의 도움을 받아야함.
        // 스트링 -> 숫자 두가지 방법
        String s1 = String.valueOf(93);
        System.out.println(s1);

        s1 = Integer.toString(93);
        System.out.println(s1); // 93
        s1 = Double.toString(93.5);
        System.out.println(s1); // 93.5
        s1 = Float.toString(93.8F);
        System.out.println(s1); // 93.5

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.5");
        System.out.println(d);

        float f = Float.parseFloat("98.8");
        System.out.println(f);

        // 숫자가 아니기에 형변환 에러가 발생함.
        // NumberFormatException.forInputString
        int error = Integer.parseInt("JAVA");
        System.out.println(error);
    }
}
