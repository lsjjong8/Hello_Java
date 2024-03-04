package chapter07.lecture;

public interface RemoteControl {
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드, 메소드 선언부만 작성
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}
