package chapter06;

import java.time.LocalDate;

public class Day {
    // 필드
    private int year = 1; // 년
    private int month = 1; // 월
    private int date = 1; // 일

    // 생성자
    public Day() { // 오늘 날짜
        LocalDate today = LocalDate.now(); // 현재 날짜
        this.year = today.getYear();
        this.month = today.getMonthValue();
        this.date = today.getDayOfMonth();
    }
    public Day(int year)                        { this.year = year; }
    public Day(int year, int month)             { this(year); this.month = month; }
    public Day(int year, int month, int date)   { this(year, month); this.date = date; }
    public Day(Day d)                           { this(d.getYear(), d.getMonth(), d.getDate()); }

    // 년, 월, 일 불러오기
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDate() { return date; }

    // 년, 월, 일 설정
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDate(int date) { this.date = date; }
    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // 요일 찾기
    public int dayOfWeek() {
        // 0: 일요일, 1: 월요일, 2: 화요일, 3: 수요일, 4: 목요일, 5: 금요일, 6:토요일
        // 그레고리안 달력을 전제로 하는 제라의 공식(1582년 10월 15일 이후의 요일 계산)
        int y = year;
        int m = month;
        if(m == 1 || m == 2) {
            y--;
            m+=12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    // 날짜 d와 같은가?
    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);
    }
}
