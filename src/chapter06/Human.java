package chapter06;

public class Human {
    // 필드
    private String name; // 이름
    private int height; // 신장
    private int weight; // 체중
    private Day birthDay; // 생일
    static int counter = 0; // 몇번까지 식별 번호를 부여했는가
    private int id; // 식별 번호

    // 생성자
    public Human(String name, int height, int weight, Day birthDay) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthDay = birthDay;
        this.id = ++counter;
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

    public int getId() { return id; } // 식별 번호 가져오기

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