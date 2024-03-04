package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int size = 250;

        for (int i = size; i <= 295; i+=5) {
            System.out.println("사이즈 " + i + " (재고 있음)");
        }

        int[] sizeArr = new int[10];
        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = size + 5*i;
        }
        for (int i = 0; i < sizeArr.length; i++) {
            System.out.println("사이즈 "+sizeArr[i]+" (재고 있음)");
        }
    }
}
