package chapter07.lecture;

public class SportsCar extends Car {

    public boolean isCoupe;

    public SportsCar() {
        super(); // 상위 클래스에 기본 생성자가 없으면 오류 발생
    }

    public SportsCar(boolean isCoupe) {
        super(isCoupe ? 2 : 4);
        this.isCoupe = isCoupe;
    }

    @Override
    public void speedUp() { speed += 10; }

    /*@Override
    public final void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }*/
}
