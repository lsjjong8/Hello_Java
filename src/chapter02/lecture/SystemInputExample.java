package chapter02.lecture;

public class SystemInputExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        System.out.print("입력 : ");

        do {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        } while (keyCode != 113);
    }
}
// char로하면 한글이 깨짐, 터미널 명령어 : chcp, terminal 인코딩 : cp 949