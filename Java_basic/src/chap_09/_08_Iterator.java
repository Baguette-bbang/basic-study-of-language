package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 순회
        // 쉽게 삭제 가능함.
        List<String> list = new ArrayList<>();
        list.add("카리나");
        list.add("유재석");
        list.add("권은비");
        list.add("유재석");
        list.add("김지원");
        list.add("유재석");
        list.add("신세경");
        list.add("유재석");
        list.add("이새롬");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------------------");

        it = list.iterator(); // 커서를 처음 위치로 초기화
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("유재석")) {
                it.remove();
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 초기화
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------");

        HashSet<String> set = new HashSet<>();
        set.add("카리나");
        set.add("황예지");

        Iterator<String> itSet = set.iterator();

        while(itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("----------------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("카리나", 10);
        map.put("카즈하", 7);

        Iterator<String> keyIt = map.keySet().iterator();
        while(keyIt.hasNext()) {
            System.out.println(keyIt.next());
        }

        Iterator<Integer> valueIt = map.values().iterator();
        while(valueIt.hasNext()) {
            System.out.println(valueIt.next());
        }

        Iterator<Map.Entry<String, Integer>> itemsIt = map.entrySet().iterator();
        while(itemsIt.hasNext()) {
            System.out.println(itemsIt.next());
        }

    }
}
