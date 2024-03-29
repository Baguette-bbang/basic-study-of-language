package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 셋 (중복 허용하지 않는다)
        HashSet<String> set = new HashSet<>(); // 구매해야하는 리스트
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("후추");
        set.add("참기름");
        set.add("소금");
        set.add("삼겹살"); // 중복
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살"); // 중복

        System.out.println("총 구매 상품 종류 수 : " + set.size());
        // 순서를 보장하지는 않음
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살을 구매해야 합니다용");
        }

        System.out.println("----------------------");
        // 삭제
        System.out.println("총 구매 상품 종류 수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 종류 수 (삼겹살 구매 후) : " + set.size());

        System.out.println("----------------------");
        //  전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발~!@!");
        }

        System.out.println("----------------------");
        // 세트는 들어온 순서를 보장하지 않고, 중복을 허용하지 않는다.
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (Integer i : intSet) {
            System.out.println(i);
        }

        System.out.println("----------------------");
        // 링크드세트는 들어온 순서를 보장하고, 중복을 허용하지 않는다.
        HashSet<Integer> intSet1 = new LinkedHashSet<>();
        intSet1.add(1);
        intSet1.add(13);
        intSet1.add(2);

        for (Integer i : intSet1) {
            System.out.println(i);
        }
    }
}
