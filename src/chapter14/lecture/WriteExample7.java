package chapter14.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample7 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp/test10.txt");

        String str = "ABC";

        writer.write(str); // ABC
        writer.write(str, 1, 2); // BC

        writer.flush();
        writer.close();
    }
}
