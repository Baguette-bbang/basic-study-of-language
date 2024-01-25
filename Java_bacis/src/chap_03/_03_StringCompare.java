package chap_03;

import sun.security.rsa.RSAUtil;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        // equals는 대소문자 "관계있이" 문자열 내용 비교
        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면  true, 다르면 false
        System.out.println(s2.equals("python")); // false
        // 대소문자 관계없이 문자열 내용 비교
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234"; // 머릿속으로 기억하는 벽에 붙은 메모지의 비밀번호 정보
        System.out.println(s1.equals(s2)); // true // 내용이 같은가?
        System.out.println(s1 == s2); // true // 참조가 같은가?

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true // 내용이 같은가?
        System.out.println(s1==s2); // false // 참조가 같은가?
        // 일반적으로 문자열의 내용을 비교할때는 equals를 사용해야한다. 기억하자.
    }
}
