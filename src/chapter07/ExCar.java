package chapter07;

import chapter06.Day;

// 서브 클래스(총 주행 거리 추가) // Car 클래스 상속
public class ExCar {
    private String name;        // 이름
    private int width;          // 폭
    private int height;         // 높이
    private int length;         // 길이
    private double x;           // 현재 위치의 X 좌표
    private double y;           // 현재 위치의 Y 좌표
    private double fuel;        // 남은 연료
    private Day purchaseDay;    // 구입일
    private double totalMileage; // 총 주행 거리 (추가)

    // 생성자
    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        this.x = this.y = 0.0;
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        this.purchaseDay = purchaseDay;
        totalMileage = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getFuel() {
        return fuel;
    }

    public Day getPurchaseDay() {
        return purchaseDay;
    }

    // 사양 표시
    public void putSpec() {
        System.out.println("이름:" + name);
        System.out.println("전폭:" + width + "mm");
        System.out.println("전고:" + height + "mm");
        System.out.println("전장:" + length + "mm");

        System.out.printf("총 주행 거리: %.2f km\n", totalMileage); // (추가)
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx*dx + dy*dy); // 이동 거리

        if(dist > fuel)
            return false; // 이동할 수 없음, 연료 부족
        else {
            fuel -= dist;
            x += dx;
            y += dy;
            
            totalMileage += dist; // (추가)

            return true; // 이동 완료
        }
    }
    
    // 총 주행 거리 확인 (추가)
    public double getTotalMileage() {
        return totalMileage;
    }
}
