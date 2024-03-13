package chapter07;

public class SkinnableSoftware implements Skinnable {

    int skin; // 스킨

    // 생성자
    public SkinnableSoftware() {
        this.skin = BLACK; // 검은색 기본으로
    }

    public SkinnableSoftware(int skin) {
        this.skin = skin;
    }

    // 인터페이스의 모든 추상 클래스를 구현해야하며, 구현하지 않을 시 추상 클래스가 됨
    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    public int getSkin() {
        return skin;
    }

    public String getSkinString() {
        switch(skin) {
            case BLACK: return "BLACK";
            case RED: return "RED";
            case GREEN: return "GREEN";
            case BLUE: return "BLUE";
            case YELLOW: return "YELLOW";
        }
        return "";
    }
}