package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

import javax.naming.ldap.HasControls;

public class _17_Final {
    // Final
    // final : 상속, 오버라이딩 값의 변경이 불가능하게 만들기 위한 키워드 (변수, 메소드, 클래스)
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-----------------------------------------------");

        // actionCam.lens = "표준렌즈"; -> 불가능
        // public final String lens = "광각렌즈"; 이기에 final
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        System.out.println(slowActionCam.name);
        slowActionCam.makeVideo();
    }
}
