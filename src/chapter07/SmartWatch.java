package chapter07;

public class SmartWatch implements Wearable {
    public void putOn() {
        System.out.println("스마트워치를 착용했습니다.");
    }

    public void putOff() {
        System.out.println("스마트워치를 벗었습니다.");
    }

    public void reset() {
        System.out.println("스마트워치를 재시작했습니다.");
    }
}
