package chapter07;

import chapter06.Day;

public class ExCarTester1 {
    public static void main(String[] args) {
        Car car1 = new Car("U221",
                                1850, 1500, 5200,80.0,
                                new Day(2022,3,12));

        car1.putSpec();
        System.out.println();

        ExCar car2 = new ExCar("W221",
                                1845, 1490, 5205,90.0,
                                new Day(2024,3,12));

        car2.putSpec();
    }
}