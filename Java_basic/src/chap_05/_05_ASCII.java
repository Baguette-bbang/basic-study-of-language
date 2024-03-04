package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c = 'A';

        for (int i = 0; i < 26; i++) {
            System.out.println((char)(((int)c)+i));
        }
    }
}
