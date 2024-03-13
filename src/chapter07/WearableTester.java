package chapter07;

public class WearableTester {
    public static void main(String[] args) {
        // Wearable a = new Wearable(); // 오류
        // Wearable을 상속한 구현체를 인터페이스 배열로 같이 담는 것이 가능
        Wearable[] devices = new Wearable[2];

        devices[0] = new Headphone(); // 헤드폰
        devices[1] = new SmartWatch(); // 스마트워치

        for (Wearable device: devices) {
            device.putOn();
        }

        for (Wearable device: devices) {
            device.putOff();
        }

        Wearable device1 = new Headphone();
        // device1 = new SmartWatch();

        // 인스턴스가 교체되도 동작을 보장 (메소드 이름이 같기 때문에)
        device1.putOn();
        device1.putOff();
        
        // 구현한 추상 메소드 외에 추가 메소드를 사용하려면 다운 캐스팅의 불편함은 감수함
        if(device1 instanceof Headphone) {
            ((Headphone)device1).setVolume(5);
        } else if(device1 instanceof SmartWatch) {
            ((SmartWatch)device1).reset();
        }
    }
}