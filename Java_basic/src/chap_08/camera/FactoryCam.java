package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public Detectable detector;
    public Reportable reporter;

    public void setDetectable(Detectable detectable) {
        this.detector = detectable;
    }

    public void setReportable(Reportable reportable) {
        this.reporter = reportable;
    }

    @Override
    public void showMainFeature() { // 추상 메소드를 자식 클래스에서 구현함.
        System.out.println("화재 감지");
    }

    public void detect() {
        detector.detect();
    }

    public void report() {
        reporter.report();
    }
}
