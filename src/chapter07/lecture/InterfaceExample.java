package chapter07.lecture;

// 첫 번째 상위 인터페이스
interface Playable {
    void play();
    void stop();
}

// 두 번째 상위 인터페이스
interface Recordable {
    void record();
    void pause();
}

// 두 상위 인터페이스를 상속받는 하위 인터페이스
interface MultimediaPlayer extends Playable, Recordable {
    // MultimediaPlayer 인터페이스에서 추가적으로 정의할 메서드 등이 있을 수 있음
    // ...
}

// MP3Player 클래스 예시 (MultimediaPlayer 인터페이스 구현)
class MP3Player implements MultimediaPlayer {
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    public void stop() {
        System.out.println("음악을 정지합니다.");
    }

    public void record() {
        System.out.println("현재 소리를 녹음합니다.");
    }

    public void pause() {
        System.out.println("녹음을 일시 정지합니다.");
    }
}

// 테스트하는 메인 클래스
public class InterfaceExample {
    public static void main(String[] args) {
        // MultimediaPlayer 인터페이스를 구현한 객체를 생성
        MultimediaPlayer player = new MP3Player(); // 예시로 MP3Player 클래스를 구현하도록 가정

        // MultimediaPlayer 인터페이스의 메서드 호출
        player.play();
        player.record();
        player.stop();
        player.pause();
    }
}