package chapter07;

import chapter06.Day;

public class Car {
    private String name;        // 이름
    private int width;          // 폭
    private int height;         // 높이
    private int length;         // 길이
    private double x;           // 현재 위치의 X 좌표
    private double y;           // 현재 위치의 Y 좌표
    private double fuel;        // 남은 연료
    private Day purchaseDay;    // 구입일

    public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        this.x = this.y = 0.0;
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        this.purchaseDay = purchaseDay;
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
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx*dx + dy*dy); // 이동 거리

        if(dist > fuel)
            return false; // 이동할 수 없음, 연료 부족
        else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true; // 이동 완료
        }
    }
}
