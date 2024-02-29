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
}

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // 반지름 5.0으로 생성
        Rectangle rectangle = new Rectangle(4.0, 6.0); // 가로 4.0, 세로 6.0 생성

        // 원의 면적과 반지름 출력
        printArea(circle);

        // 사각형의 면적과 가로, 세로 출력
        printArea(rectangle);;
    }
    static void printArea(Circle circle) {
        System.out.println("Circle Area: " + circle.calculateArea());
    }

    static void printArea(Rectangle rectangle) {
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }


    // Shape 타입의 객체에 대한 출력
    /*static void printArea(Shape shape) {
        System.out.println("Shape Area: " + shape.calculateArea());
    }*/
}