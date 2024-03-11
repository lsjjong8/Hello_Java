package chapter06;

public class Human {
    // 필드
    private String name; // 이름
    private int height; // 신장
    private int weight; // 체중
    private Day birthDay; // 생일

    // 생성자
    public Human(String name, int height, int weight, Day birthDay) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthDay = birthDay;
    }

    String getName() {
        return name;
    }

    int getHeight() {
        return height;
    }

    int getWeight() {
        return weight;
    }

    // 메서드
    void gainWeight(int w) {
        weight += w;
    }

    void reduceWeight(int w) {
        weight -= w;
    }

    public void putData () {
        System.out.println("이름 :" + name);
        System.out.println("신장 :" + height + "cm");
        System.out.println("체중 :" + weight + "kg");
    }

    public String toString() {
        return "{" + name + ": " + height + "cm " + weight + "kg " + birthDay + "출생";
    }
}