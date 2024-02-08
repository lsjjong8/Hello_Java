package chapter02;

public class SumAvrByThree {
    public static void main(String[] args) {
        int x = 63, y = 18, z = 52;

        // 합계 계산
        int sum = x + y + z;
        int avg = sum/3;

        // x, y, z의 값 각각 한 줄에 출력
        // 예시) x값은 63 입니다.
        System.out.println("x값은 "+ x +" 입니다.");
        System.out.println("y값은 "+ y +" 입니다.");
        System.out.println("z값은 "+ z +" 입니다.");

        // 합계와 평균 각각 한 줄에 출력
        // 예시) 합계는 000 입니다.
        System.out.println("합계는 "+ sum +" 입니다.");
        System.out.println("평균은 "+ avg +" 입니다.");
    }
}

// 동일한 계산식을 여러번 작성하면 불필요한 계산 시간이 소요
// 동일한 계산식을 작성하다 실수로 타이핑을 잘못할 가능성 존재