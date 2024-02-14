package chapter02.lecture;

public class DoubleEx {

    public static void main(String[] args) {

        double value = 1;

        for(int i=0; i<10000; i++){
            value = value + 0.1;
        }

        System.out.println(value); // 부정확
        // 실제 현업에서는 부정확하여 BigDecimal로 계산
        // 세금 납부 등 돈과 같은 예민한 부분에서 오차가 발생하지 않도록 방지
    }

}