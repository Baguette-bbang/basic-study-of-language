package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int disabledCar = 0;
        int normalCar = 0;
        int lightCar = 0;
        int hour = 10;

        int hourPerFee = hour * 4000;
        if (hourPerFee >= 30000) {
            hourPerFee = 30000;
        }

        disabledCar = hourPerFee/2;
        normalCar = hourPerFee;
        lightCar = hourPerFee/2;

        System.out.println("일반 차량 요금 : "+normalCar);
        System.out.println("경차 요금 : " + lightCar);
        System.out.println("장애인 차량 요금 : " + disabledCar);

    }
}
