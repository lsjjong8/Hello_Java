package chapter07;

import java.sql.SQLOutput;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
    private int skin; // 스킨

    // 생성자
    public SkinnableRobotPet(String name, String masterName, int skin) {
        super(name, masterName); // RobotPet의 생성자
        this.skin = skin;
    }

    // 스킨 변경
    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }
    
    // 현재의 스킨을 표시
    public void printSkin() {
        switch(skin) {
            case BLACK:
                System.out.print("검정");
                break;
            case RED:
                System.out.print("빨강");
                break;
            case GREEN:
                System.out.print("초록");
                break;
            case BLUE:
                System.out.print("파랑");
                break;
            case YELLOW:
                System.out.print("노랑");
                break;
        }
    }
}
