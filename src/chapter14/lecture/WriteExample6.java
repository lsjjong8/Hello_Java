package chapter14.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample6 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp/test9.txt");

        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3); // BCD

        writer.flush();
        writer.close();
    }
}
