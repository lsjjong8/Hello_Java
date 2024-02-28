package chapter06.lecture;

public class Car {
    public String model;

    public String color;

    public int maxSpeed;

    Car() {} // 기본 생성자

    Car(String model) {
        this.model = model;
    }

    // 컴파일 오류 발생
    /* Car(String color) {
        this.color = color;
    }*/

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this(model, color);
        this.maxSpeed = maxSpeed;
    }
}