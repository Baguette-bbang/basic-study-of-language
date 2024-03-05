package chap_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵(Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가 add가 아닌 put으로 가능 키, 밸류 순서
        map.put("카리나", 10);
        map.put("권은비", 8);
        map.put("이새롬", 8);

        System.out.println("총 고객 수 : " + map.size());

        System.out.println("----------------------");
        // 조회
        System.out.println("카리나님의 포인트 : " + map.get("카리나"));
        System.out.println("권은비님의 포인트 : " + map.get("권은비"));

        System.out.println("----------------------");
        if (map.containsKey("김지원")) {
            int point = map.get("김지원");
            map.put("김지원", ++point);
            System.out.println("김지원님의 누적 포인트 : " + map.get("김지원"));
        }
        else {
            map.put("김지원" , 1);
            System.out.println("김지원님 신규 등록 (포인트 1)");
        }
        System.out.println("----------------------");
        // 삭제
        map.remove("권은비");
        System.out.println(map.get("권은비")); // null

        System.out.println("----------------------");
        // 전체 삭제
        map.clear(); // 전체 삭제
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게를 접어야죠 뭐..");
        }

        System.out.println("----------------------");
        map.put("카리나", 10);
        map.put("권은비", 8);
        map.put("이새롬", 8);
        map.put("김지원" , 6);

        // Key 확인 (들어온 순서가 보장되지 않는다.)
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }

        System.out.println("----------------------");
        // 링크드 해시맵 들어온 순서 보장
        HashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("카리나", 10);
        map1.put("권은비", 8);
        map1.put("이새롬", 8);
        map1.put("김지원" , 6);
        // 들어온 순서가 보장된다.
        for (String key :
                map1.keySet()) {
            System.out.println(key);
        }

        System.out.println("----------------------");
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------------------");
        // 키-밸류를 한번에 확인하는 법
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("----------------------");
        map.put("카리나", 11);
        // 중복은 허용하지 않지만 마지막으로 업데이트한 값만 유효하게 남음
        System.out.println(map.get("카리나"));
    }
}
