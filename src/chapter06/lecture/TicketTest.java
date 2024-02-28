package chapter06.lecture;

public class TicketTest {
    public static void main(String[] args) {

        // 객체 생성 후 인스턴스 필드 호출
        Ticket ticket = new Ticket(); // 티켓 객체 생성

        long localValue = ticket.fee; // 힙 영역의 값을 스택 변수에 값 복사

        System.out.println("지역변수 값 : " + localValue); // 1000
        System.out.println("인스턴스 변수 값 : " + ticket.fee); // 1000

        ticket.fee = 2000L; // 티켓 가격 변경 (힙 메모리)

        System.out.println("지역변수 값 : " + localValue); // 1000
        System.out.println("인스턴스 변수 값 : " + ticket.fee); // 2000

        localValue = 2000L; // 티켓 가격 변경 (스택 메모리)

        System.out.println("지역변수 값 : " + localValue); // 2000
        System.out.println("인스턴스 변수 값 : " + ticket.fee); // 2000
    }
}