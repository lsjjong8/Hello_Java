package chapter14.lecture;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Board implements Serializable {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private LocalDate date;

    public Board(int bno, String title, String content, String writer, LocalDate date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                '}';
    }
}
public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        writeList();
        List<Board> list = readList();

        for(Board board : list) {
            System.out.println(board);
        }
    }

    public static void writeList() throws Exception {
        List<Board> list = new ArrayList<>();

        list.add(new Board(1, "제목1", "내용1", "글쓴이1", LocalDate.now()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", LocalDate.now()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", LocalDate.now()));

        FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }

    public static List<Board> readList() throws Exception {
        FileInputStream fis = new FileInputStream("C:/Temp/board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject();
        return list;
    }
}