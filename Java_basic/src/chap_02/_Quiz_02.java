package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 120;
        String possible =  "키가 " + height + "이므로 탑승 가능합니다.";
        String impossible = "키가 " + height + "이므로 탑승 불가능합니다.";
        String whether = (height >= 120) ? possible : impossible;
        System.out.println(whether);

        height = 115;
        possible =  "키가 " + height + "이므로 탑승 가능합니다.";
        impossible = "키가 " + height + "이므로 탑승 불가능합니다.";
        whether = (height >= 120) ? possible : impossible;
        System.out.println(whether);
    }
}
