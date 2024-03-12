package chapter07;

import chapter06.Day;

// 서브 클래스(총 주행 거리 추가)
public class ExCar extends Car {  // 서브클래스 : 자식, // 하위클래스 : 자식, 손자, 증손자
    private double totalMileage; // 총 주행 거리 (추가)

    // 생성자
    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        totalMileage = 0.0; // (추가)
    }

    // 사양 표시 (오버라이딩)
    @Override // 어노테이션 (필수는 아니지만 실수 방지 차원에서 권장)
    public void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리: %.2f km\n", totalMileage); // (추가)
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx*dx + dy*dy); // 이동 거리

        if(!super.move(dx, dy))
            return false; // 이동할 수 없음, 연료 부족
        else {
            totalMileage += dist; // (추가)
            return true;
        }
    }

    // 총 주행 거리 확인 (추가)
    public double getTotalMileage() {
        return totalMileage;
    }
}
