package chapter07;

public class DVDPlayer implements ExPlayer {
    @Override
    public void play() {
        System.out.println("■ DVD 재생 시작!");
    }

    @Override
    public void stop() {
        System.out.println("■ DVD 재생 정지!");
    }

    @Override
    public void slow() {
        System.out.println("■ DVD 느린 재생 시작!");
    }
}
