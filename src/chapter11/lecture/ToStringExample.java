package chapter11.lecture;


import java.time.LocalDate;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        LocalDate obj2 = LocalDate.of(2024, 3, 19);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
