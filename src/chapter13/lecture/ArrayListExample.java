package chapter13.lecture;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // String 객체를 저장

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBatis");

        int size = list.size(); // 저장된 총 객체 수 얻기
        System.out.println("총 객체수: " + size);
        System.out.println();
        
        String oneOfSkill = list.get(2);
        System.out.println("2: " + oneOfSkill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        list.remove(2); // 2번 인덱스 문자열 객체 삭제 (Database)
        list.remove(2); // 2번 인덱스 문자열 객체 삭제 (Servlet/JSP)
        list.remove("iBATIS");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        System.out.println(list); // for 루프를 사용하지 않아도 list의 toString()으로 가시화 가능
    }
}
