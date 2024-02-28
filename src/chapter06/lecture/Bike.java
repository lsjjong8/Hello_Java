package chapter06.lecture;

public class Bike {
    // 고유 데이터
    public String company;
    String model;
    String color;

    int speed;

    public void drive() {
        System.out.println("주행 시작");
    }

    public void stop() {
        System.out.println("정지");
    }

    public void accelerate(int increment) {
        this.speed += increment;
    }
}