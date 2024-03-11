package chapter06;

public class AccountTester1 {
    public static void main(String[] args) {
        Day d = new Day(2010, 10, 15);
        Account gildong = new Account("홍길동", "0125768", 100, d);

        Day p = gildong.getOpenDay();
        System.out.println("계좌 개설일:" + p);

        p.set(1999, 12, 31); // 개설일을 변경한다?

        Day q = gildong.getOpenDay();
        System.out.println("계좌 개설일:" + q);
    }
}
