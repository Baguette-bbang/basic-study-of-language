package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // 상속은 IS-A 관계이다.
        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a Person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a Person)

        // 여기서 다형성 개념이 등장 가능하다.
        // 카메라라는 하나의 객체가 공장카메라, 스피드카메라와 같이 여러 타입의 인스턴스로 취급될 수 있다.
        // 하나의 객체가 여러 타입의 인스턴스로 취급될 수 있는 성질 ( 상속과 인터페이스를 통해 구현 )
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("---------------------------------");

        // 아래 부모 클래스에 없는 자식 클래스의 함수는 사용 불가능하다.
//        factoryCam.detectFire();
//        speedCam.recognizeLicensePlate();
//        speedCam.checkSpeed();

        // 명시적으로 사용해야한다.
        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        System.out.println("---------------------------------");

        // 모든 자바 클래스는 특정 클래스를 상속하고 있다(Object 클래스)
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

        for (Object obj : objs) {
            ((Camera) obj).showMainFeature();
        }
    }
}
