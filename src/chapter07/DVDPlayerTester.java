package chapter07;

public class DVDPlayerTester {
    public static void main(String[] args) {
        Player a = new DVDPlayer();
        ExPlayer b = new DVDPlayer();
        DVDPlayer c = new DVDPlayer();

        System.out.println("Player형 변수a");
        a.play();
        a.stop();

        System.out.println("ExPlayer형 변수b");
        b.play();
        b.stop();
        b.slow();

        System.out.println("DVD형 변수c");
        b.play();
        b.stop();
        b.slow();
    }
}
