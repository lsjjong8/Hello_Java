package chapter06;

public class Period {
    private Day from; // 시작일
    private Day to; // 종료일

    public Period(Day from, Day to) {
        this.from = from;
        this.to = to;
    }

    // 시작일 복사본 반환
    public Day getFrom() {
        return new Day(from);
    }

    // 종료일 복사본 반환
    public Day getTo() {
        return new Day(to);
    }

    public String toString() {
        return "{" + from + " ~ " + to + "}";
    }
}
