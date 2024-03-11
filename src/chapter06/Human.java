package chapter06;

public class Human {
    // 필드
    String name; // 이름
    int height; // 신장
    int weight; // 체중

    // 생성자
    Human(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // 메서드
    void gainWeight(int w) {
        weight += w;
    }

    void reduceWeight(int w) {
        weight -= w;
    }
}