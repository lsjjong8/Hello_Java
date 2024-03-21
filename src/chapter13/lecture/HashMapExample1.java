package chapter13.lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        map.put("김철수", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 홍길동 키가 같기 때문에 제일 마지막 저장한 값으로 대체
        System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Entry 수 얻기

        // 객체 찾기
        System.out.println("\t홍길동: " + map.get("홍길동")); // 이름(키)으로 점수(값)를 검색
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet(); // keySet 얻기
        Iterator<String> keyIterator = keySet.iterator();

        System.out.println("keySet의 Iterator 사용");
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        System.out.println("keySet만을 활용한 향상된 for문");
        for(String key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("홍길동"); // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수: " + map.size());

        // Map.Entry를 이용하여 객체를 하나씩 처리 (비추)
        // 하지만 내부에 존재하는 중첩 인터페이스 Entry를 체험해보자
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }
}
