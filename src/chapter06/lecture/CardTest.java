package chapter06.lecture;

public class CardTest {
    public static void main(String[] args) {
        // 카드 객체 생성
        Card myCard = new Card();

        myCard.number = 7;
        myCard.color = "Red";
        myCard.shape = "Heart";


        // 카드 사이즈 출력
        System.out.println("Card Size: " + Card.CARD_WIDTH + " x " + Card.CARD_HEIGHT);
        System.out.println("Number: " + myCard.number);
        System.out.println("Color: " + myCard.color);
        System.out.println("Shape: " + myCard.shape);
    }
}
