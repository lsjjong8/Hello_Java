package chapter07.lecture;

public class CarTest {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

        System.out.println("speed initValue : " + sportsCar.speed);

        sportsCar.speedUp();
    }
}