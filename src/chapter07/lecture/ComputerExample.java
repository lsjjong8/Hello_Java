package chapter07.lecture;

class Calculator {
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14*r*r;
    }
}

class Computer extends Calculator {
    @Override // 생략 가능하지만 실수를 방지, 컴파일러가 시그니처 동일 여부 확인
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI*r*r; // 정밀한 계산을 위해 수정
    }
}

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer1 = new Computer();
        System.out.println("원 면적 : " + computer1.areaCircle(r));
        System.out.println();


        Calculator computer2 = new Computer(); // 메소드 다형성
        System.out.println("원 면적 : " + computer2.areaCircle(r));
        System.out.println();
    }
}