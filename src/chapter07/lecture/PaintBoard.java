package chapter07.lecture;

import java.util.ArrayList;
import java.util.List;

// 그릴 수 있는 객체를 나타내는 인터페이스
interface Drawable {
    void draw();
}

// 인터페이스를 상속하는 추상 클래스
abstract class Shape_ implements Drawable {

    // Drawable 인터페이스의 메서드 구현
    public void draw() {
        System.out.println("도형을 그립니다.");
    }

    // 추상 메서드: 구현체 클래스에서 반드시 구현되어야 함
    public abstract double calculateArea();
}

// 추상 클래스를 상속받는 구체 클래스
class Circle_ extends Shape_ {
    private double radius;

    public Circle_(double radius) {
        super();
        this.radius = radius;
    }

    // AbstractShape의 추상 메서드 구현
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 구체 클래스를 상속받는 또 다른 구체 클래스
class Rectangle_ extends Shape_ {
    private double width;
    private double height;

    public Rectangle_(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // AbstractShape의 추상 메서드 구현
    public double calculateArea() {
        return width * height;
    }
}

// 도형을 관리하는 클래스
public class PaintBoard {
    private List<Drawable> drawables = new ArrayList<>();

    // 도형을 추가하는 메서드
    public void addShape(Shape_ shape) {
        drawables.add(shape);
    }

    // 모든 도형을 그리는 메서드
    public void drawAllShapes() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    // 각 도형의 넓이를 계산하여 출력하는 메서드
    public void printAllAreas() {
        for (Drawable drawable : drawables) {
            double area = ((Shape)drawable).calculateArea();
            System.out.println("도형의 넓이: " + area);
        }
    }
}
