package chapter06;

public class Id {
    static int counter = 0; // 몇번까지 식별 번호를 부여했는가
    private int id; // 식별 번호

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}
