package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성하는 3가지 방법
        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        Arrays.stream(scores);
        IntStream scoreStream = Arrays.stream(scores);
        String[] langs = {"Python", "Java", "JavaScript", "C", "C++", "C#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Python", "Java", "JavaScript", "C", "C++", "C#");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("Python", "Java", "JavaScript", "C", "C++", "C#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // 클래스명과 메소드명을 클론 두개로 구분해서 적는다면 앞에서 넘어오는 데이터가 자동으로 들어간다.
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 90점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);

        System.out.println("--------------------------------------");

        // 90점 이상인 사람들의 점수 합
        long sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);

        System.out.println("--------------------------------------");

        // 90점 이상인 사람들의 점수를 정렬해서 보여주기
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);

        System.out.println("--------------------------------------");

        // "Python", "Java", "JavaScript", "C", "C++", "C#"
        // "C"로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);

        // Java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 글자 개수가 4글자 이하인 언어를 정렬해서 출력(abc 순서대로)
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
        langList.stream().filter(x-> x.length() <= 4 && x.contains("C")).sorted().forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch); // true

        System.out.println("--------------------------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch); // false

        System.out.println("--------------------------------------");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어 뒤에 "(어려움)" 이라는 글자를 함께 출력하기
        // map
        langList.stream()
                .filter(x -> x.contains("C"))
                .filter(x -> x.length() <= 4)
                .map(x -> x + " (어려움)")
                .forEach(System.out::println);

        System.out.println("--------------------------------------");

        // C라는 글자를 포함하는 언어를 소문자로 출력하기
        langList.stream()
                .filter(x -> x.contains("C"))
                .map(x -> x.toLowerCase())
                .forEach(System.out::println);

        System.out.println("--------------------------------------");

        // C 라는 글자를 포함하는 언어를 소문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);
    }
}
