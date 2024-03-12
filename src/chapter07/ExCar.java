package chapter07;

import chapter06.Day;

// 서브 클래스(총 주행 거리 추가)
public class ExCar extends Car { // Car 클래스 상속
    private double totalMileage; // 총 주행 거리

    // 생성자
    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        // super();
        super(name, width, height, length, fuel, purchaseDay);
        totalMileage = 0.0;
    }

    // 총 주행 거리 확인
    public double getTotalMileage() {
        return totalMileage;
    }

    // 사양 표시
    public void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리: %.2f km\n", totalMileage);
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx*dx + dy*dy); // 이동 거리
        if(!super.move(dx, dy))
            return false;
        else {
            totalMileage += dist;
            return true;
        }
    }
}
