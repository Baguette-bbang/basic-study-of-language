package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화(Encapsulation) : 관련이 있는 기능, 데이터들끼리 서로 연관된 것들끼리만 같은 캡슐에 담는 것
        // 정보 은닉(Information hiding) : 정보를 숨기는 것, 올바르지 않는 값으로의 변경, 직접적인 접근과 허용하지 않는 방식을 제어 하는 것

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능함.
        // public : 모든 클래스에서 접근 가능하다.
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능함.
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능함.(상속과 연관되는 개념임)

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.setPrice(100000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("----------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
