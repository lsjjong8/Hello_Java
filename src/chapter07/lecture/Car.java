package chapter07.lecture;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
        System.out.println("speed : " + speed);
    }

    // final 메소드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
