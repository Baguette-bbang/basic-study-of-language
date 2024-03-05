package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 배열
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // 배열이 선언한 크기보다 더 많이 사용하고 싶다면?

        // 컬렉션 프레임워크(List, Set, Map) -> 크기가 동적임
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("이광수");
        list.add("양세찬");

        // 데이터 조회(인덱스)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------");
        // 객체 직접 지정 제거 (리스트에 해당 객체가 여러 개 있으면 첫 번째로 발견된 객체만 제거된다)
        // 객체가 없다면 false 반환
        list.remove("조세호");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------");
        // 인덱스로 제거
        // 해당 인덱스가 없다면 IndexOutOfBoundsException 발생
        list.remove(1);
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        // 변경
        list.set(0, "카리나");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        // 포함여부 확인
        String name = "윈터";
        if (list.contains(name)) {
            System.out.println(name + " : 수강 신청 성공");
        }
        else {
            System.out.println(name + " : 수강 신청 실패");
        }

        System.out.println("----------------------");
        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("나니모... 나캇타..!");
        }

        System.out.println("----------------------");

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("이광수");
        list.add("양세찬");

        // 정렬 (가나다순)
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
