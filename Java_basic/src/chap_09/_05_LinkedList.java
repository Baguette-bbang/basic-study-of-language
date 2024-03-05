package chap_09;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("카리나");
        list.add("이새롬");
        list.add("김지원");
        list.add("카즈하");
        list.add("황예지");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------------");

        // 시작위치 추가
        list.addFirst("고윤정");
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        // 끝 위치 추가
        list.addLast("신세경");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        // 중간 위치 추가
        list.add(2, "이채영");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        // 삭제
        System.out.println("삭제 전 : " + list.size());
        list.remove(list.size()-1);
        System.out.println("삭제 후 : " + list.size());

        System.out.println("----------------------");

        System.out.println("삭제 전 : " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("삭제 후 : " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        // 변경
        list.set(1, "황예지");
        System.out.println(list.get(1));

        System.out.println("----------------------");
        // 인덱스 확인
        System.out.println(list.indexOf("카리나"));
        if (list.contains("키리나")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------------------");
        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("나니모.. 나캇타...!");
        }

        System.out.println("----------------------");
        // 정렬
        list.add("카리나");
        list.add("이새롬");
        list.add("김지원");
        list.add("카즈하");
        list.add("황예지");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
