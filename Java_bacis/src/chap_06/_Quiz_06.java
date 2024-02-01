package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String str, int start) {
        String new_str = str.substring(0,start);
        int len = str.length()-new_str.length();
        for (int i = 0; i < len; i++) {
            new_str += "*";
        }
        return new_str;
    }

    public static void main(String[] args) {
        String name="강영민";
        System.out.println("이름 : "+getHiddenData(name, 1));

        String identifyNum = "000312-1234567";
        System.out.println("주민등록번호 : "+getHiddenData(identifyNum, 8));

        String phoneNum = "010-2360-4411";
        System.out.println("전화번호 : "+getHiddenData(phoneNum, 9));
    }
}
