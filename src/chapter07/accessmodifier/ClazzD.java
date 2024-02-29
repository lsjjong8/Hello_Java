package chapter07.accessmodifier;

import chapter07.lecture.ClazzA;

public class ClazzD {
    public void method() {
        ClazzA a = new ClazzA(); // 생성자 호출 불가
        a.field = "value"; // 필드 접근 불가
        a.method(); // 메서드 접근 불가
    }
}