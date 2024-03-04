package chap_07;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        BlackBox.callServiceCenter();

        String s = String.valueOf(3);


    }
}
