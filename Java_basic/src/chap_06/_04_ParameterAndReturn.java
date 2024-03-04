package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int num) {
        return num*num;
    }

    public static int getPowerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * num;
        }
        return result;
    }
    public static void main(String[] args) {
        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal);
    }
}
