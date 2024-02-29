package chapter07.lecture;

class Tire {
    String brand;

    Tire(String brand) {
        this.brand = brand;
    }

    void roll() {
        System.out.println(brand + " 타이어가 굴러갑니다.");
    }
}

class KumhoTire extends Tire {
    KumhoTire() {
        super("금호");
    }

    @Override
    void roll() {
        System.out.println(brand + " 타이어가 경쾌하게 굴러갑니다.");
    }
}

class HankookTire extends Tire {
    HankookTire() {
        super("한국");
    }

    @Override
    void roll() {
        System.out.println(brand + " 타이어가 부드럽게 굴러갑니다.");
    }
}

class MyCar {
    Tire frontLeftTire;
    Tire frontRightTire;
    Tire rearLeftTire;
    Tire rearRightTire;

    MyCar(Tire frontLeftTire, Tire frontRightTire, Tire rearLeftTire, Tire rearRightTire) {
        this.frontLeftTire = frontLeftTire;
        this.frontRightTire = frontRightTire;
        this.rearLeftTire = rearLeftTire;
        this.rearRightTire = rearRightTire;
    }

    void drive() {
        System.out.println("자동차가 주행 중입니다.");
        frontLeftTire.roll();
        frontRightTire.roll();
        rearLeftTire.roll();
        rearRightTire.roll();
    }
}

public class MyCarExample {
    public static void main(String[] args) {
        KumhoTire frontLeft = new KumhoTire();
        KumhoTire frontRight = new KumhoTire();
        HankookTire rearLeft = new HankookTire();
        HankookTire rearRight = new HankookTire();

        MyCar myCar = new MyCar(frontLeft, frontRight, rearLeft, rearRight);

        myCar.drive();
    }
}