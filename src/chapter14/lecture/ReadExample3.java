package chapter14.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/test3.db"); // 20, 30, 40

        byte[] buffer= new byte[5];

        int readByteNum = is.read(buffer, 2, 3);

        if(readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        is.close();
    }
}
