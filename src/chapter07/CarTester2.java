package chapter07;

import chapter06.Day;

public class CarTester2 {
    public static void main(String[] args) {
        Car car1 = new ExCar("W140",
                1885, 1490, 5220,95.0,
                new Day(2018,10,13));

        // 오버라이딩, 메시지를 받은 인스턴스는 자신의 형이 무엇인지 알고 있으며 적절한 동작을 한다
        car1.putSpec(); // 사양 표시
    }
}