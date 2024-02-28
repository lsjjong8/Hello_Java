package chapter06.lecture;

public class CarTest {
    public static void main() {
        // 생성자 호출
        Car car = new Car();
        Car spark = new Car("스파크");
        Car sonata = new Car("소나타", "검은색");
        Car granduer = new Car("그랜저", "흰색", 300);
    }
}