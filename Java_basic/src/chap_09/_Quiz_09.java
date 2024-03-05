package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        // 먼저 데이터를 넣는다. (맵)
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("유재석", "파이썬"));
        students.add(new Student("박명수", "자바"));
        students.add(new Student("김종국", "자바"));
        students.add(new Student("조세호", "C"));
        students.add(new Student("서장훈", "파이썬"));

        Iterator<Student> iterator = students.iterator();

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("------------------");
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}
class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
