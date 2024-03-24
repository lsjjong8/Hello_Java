package chapter14.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample4 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp/test7.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }
}
