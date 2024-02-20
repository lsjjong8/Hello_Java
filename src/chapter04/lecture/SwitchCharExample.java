package chapter04.lecture;

public class SwitchCharExample {
    public static void main(String[] args) {
        char memberShipGrade = 'B';

        switch(memberShipGrade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
