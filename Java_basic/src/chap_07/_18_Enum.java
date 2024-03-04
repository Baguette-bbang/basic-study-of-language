package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR, .....
        // 옷 사이즈 : S, M, L, XL
        // OS 종류 : WIN10, WIN 11, MAC)S, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ....

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }
        System.out.println("-----------------------");

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + (myRes.ordinal()+1));
        }

        System.out.println("-----------------------");

        for(Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }

        System.out.println("-----------------------");
        // 매개값으로 주어진 열거 객체를 비교해서 순번 차이를 리턴
        Resolution r1 = Resolution.FHD;
        Resolution r2 = Resolution.HD;

        System.out.println(r1.compareTo(r2));
        System.out.println(r2.compareTo(r1));
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}