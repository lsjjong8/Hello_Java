package chapter07.lecture;

public class SmartTelevision implements RemoteControl, Searchable {
    // 필드
    private int volume;

    // RemoteControl 구현 startRegion
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
    // RemoteControl 구현 endRegion

    // Searchable 구현 startRegion
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
    // Searchable 구현 endRegion
}