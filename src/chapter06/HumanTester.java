package chapter06;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60);
        Human chulsu = new Human("김철수", 166, 72);

        gildong.gainWeight(3); // 홍길동이 3kg 쪘다. gainWeight에 Paramter값 전달
        chulsu.reduceWeight(5); // 김철수가 5kg 빠졌다. reduceWeight에 Paramter값 전달

        System.out.println("이름:" + gildong.name);
        System.out.println("신장:" + gildong.height + "cm");
        System.out.println("체중:" + gildong.weight + "kg");
        System.out.println();

        System.out.println("이름:" + chulsu.name);
        System.out.println("신장:" + chulsu.height + "cm");
        System.out.println("체중:" + chulsu.weight + "kg");
    }
}
