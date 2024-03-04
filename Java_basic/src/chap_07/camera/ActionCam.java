package chap_07.camera;

public class ActionCam extends Camera {
    public final String lens = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
    }
//   // 생성자 안에서 초기화를 진행해도 된다.
//    public final String lens;
//    public ActionCam() {
//        super("액션 카메라");
//        lens = "광각렌즈";
//    }
    public ActionCam(String name) {
        this.name = name;
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " +
                this.lens + "를 통해 촬영하여 멋진 비디오를 제작합니다.");
    }
}
