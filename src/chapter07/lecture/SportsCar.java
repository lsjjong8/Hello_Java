package chapter07.lecture;

class SportsCar extends Car {

    public boolean isCoupe;

    public SportsCar() {
        super(); // 상위 클래스에 기본 생성자가 없으면 오류 발생
    }

    public SportsCar(boolean isCoupe) {
        super(isCoupe ? 2 : 4);
        this.isCoupe = isCoupe;
    }
}
