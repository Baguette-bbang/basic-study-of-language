package chap_07;
// 어떤 이상한 값이 들어간다던지 값 설정하다가
// 발생할 수 있는 오류를 줄일 수 있고
// 값을 가져오는 과정에서도 그 값이 없다거나 이상하다거나
// 할 때 대안으로 줄 수 있는 값을 설정할 수 있다.
public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 2000000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("----------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
