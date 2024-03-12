package chapter06;

public class ExId {
    static int counter = 0; // 몇 번까지 식별 번호를 부여했는가
    private static int increment = 1; // 증가치
    private int id;

    public ExId() {
        id = counter += increment; // 식별 번호
    }

    // 식별 번호 가져오기
    public int getId() {
        return id;
    }

    // 증가치 가져오기
    public static int getIncrement() {
        return increment;
    }

    // 증가치 설정
    public static void setIncrement(int i) {
        ExId.increment = (i>=1)? i:1;
    }

    // 마지막에 부여한 식별 번호 가져오기
    public static int getMaxId() {
        return counter;
    }
}
