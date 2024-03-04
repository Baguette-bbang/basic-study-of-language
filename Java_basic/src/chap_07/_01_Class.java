package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Objet-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 이렇듯 제품이 만들어질 때마다 매번 새롭게 정의한다는 것은 굉장히 비효율적이다.
        // 이럴때 클래스를 사용하게 된다.
        // 클래스명, 객체, 이름
        BlackBox bbox = new BlackBox();
        // bbox 객체는 BlackBox 클래스의 인스턴스

    }
}
