package chapter08.lecture;

class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}

class CallListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}

class MessageListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();
        
        btn.setOnClickListener(new CallListener());
        btn.touch();
        
        btn.setOnClickListener(new MessageListener());
        btn.touch();
        
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("익명 구현 객체");
            }
        });
        btn.touch();
    }
}