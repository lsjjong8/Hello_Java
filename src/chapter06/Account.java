package chapter06;

public class Account {
    private String name;    // 계좌 명의
    private String no;      // 계좌 번호
    private long balance;   // 예금 잔고
    private Day openDay;    // 계좌 개설일


    public Account(String name, String no, long balance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = openDay;
    }


    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public Day getOpenDay() {
        return openDay;
    }


    // k원 입금
    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    // toString(), 계좌 기본 정보 반환
    public String toString() {
        return "{" + name + ", " + no + ", " + balance + "}";
    }
}
