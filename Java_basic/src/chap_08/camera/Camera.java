package chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("녹화를 시작합니다.");
    }

    // 메소드를 선언만 해도 됨.
    public abstract void showMainFeature(); // 구현해야 하는 메소드 (보통 자식 클래스에서 정의함)
}
