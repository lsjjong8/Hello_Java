package chapter07;

import chapter06.Day;

public class CarTester1 {
    public static void main(String[] args) {
        Car car1 = new Car("W140",
                1885, 1490, 5220,95.0,
                new Day(2018,10,13));

        ExCar car2 = new ExCar("W221",
                1845, 1490, 5205,90.0,
                new Day(2015,12,24));

        Car x;      // 참조 변수는
        x = car1;   // 자신의 클래스형 인스턴스를 참조할 수 있다 (당연)
        x = car2;   // 하위(자식) 클래스형의 인스턴스도 참조할 수 있다!

        ExCar y;    // 참조 변수는
        // y = car1;   // 상위 클래스형의 인스턴스를 참조할 수 없다!
        y = car2; // 자신의 클래스형 인스턴스를 참조할 수 있다 (당연)

        System.out.println("y구입일:" + y.getPurchaseDay());
        System.out.println("y의 총 주행 거리:" + y.getTotalMileage());
    }
}