package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (뼈대만 제공하는 구조)
        // 상속 (extends : 부모를 하나만 가질 수 있음) -> 단일 상속
        // 하지만 여러 부모를 상속받아야 하는 경우는?

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-----------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedDetector = new AdvancedFireDetector();
        advancedDetector.detect();

        System.out.println("-----------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetectable(fireDetector);
        factoryCam.setReportable(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
