package chapter07.lecture;

class Shape {
    public double calculateArea() {
        return 0.0; // 부모 클래스의 기본 구현
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // 원의 면적 계산
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // 직사각형의 면적 계산
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0); // 반지름 5.0으로 생성
        Shape rectangle = new Rectangle(4.0, 6.0); // 가로 4.0, 세로 6.0 생성

        // 원의 면적과 반지름 출력
        printArea(circle);
        System.out.println("반지름: " + ((Circle)circle).getRadius());

        // 사각형의 면적과 가로, 세로 출력
        printArea(rectangle);;
        System.out.println("가로길이: " + ((Rectangle)rectangle).getWidth());
        System.out.println("세로길이: " + ((Rectangle)rectangle).getHeight());
    }

    // Shape 타입의 객체에 대한 출력
    static void printArea(Shape shape) {
        System.out.println("Shape Area: " + shape.calculateArea());
    }
}