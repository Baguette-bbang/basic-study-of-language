package chap_03;

import java.sql.SQLOutput;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요.");

        // "\n" : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        // "\t" : tab을 넣어주는 용도 글자 간격까지 맞춰줌(이건 몰랐네)
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전 \t8000원");

        // 파일경로를 표현할때 우리는 역슬래시를 표현
        // "\\" : 역슬래쉬를 두 번 적으면 한 번으로 표현됨.
        System.out.println("C:\\Program Files\\Java");

        // 단비가 "냐옹" 이라고 했다.
        // '\"' : 큰 따옴표나 작은 따옴표를 사용할 때는 앞에 역슬래쉬 하나를 붙여야한다.
        System.out.println("단비가 \"냐옹\"이라고 했다.");
        System.out.println("단비가 \'냐옹\'이라고 했다.");
    }
}
