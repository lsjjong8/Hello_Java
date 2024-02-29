package chapter07.lecture;

public class InheritanceExample {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog1 = new Dog("맥스", "개", "골든 리트리버");

        System.out.println("동물의 이름: " + dog1.name);
        System.out.println("동물의 종류: " + dog1.species);
        System.out.println("강아지의 품종: " + dog1.breed);
        System.out.println();

        Animal dog2 = new Dog("맥스", "개", "골든 리트리버"); // 다형성이 아닌 name hiding
        // 변경된 상위 클래스의 필드 출력
        System.out.println("동물의 이름: " + dog2.name);
    }
}
