package chapter09.ex3;

import java.util.ArrayList;

public class FruitBoxEx3 { //
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class Juicer {
    static String makeJuice(FruitBox<? extends Object> box) {
        String tmp = "";

        for(Fruit f: box.getList()) tmp += f + " ";

        return tmp + "Juice";
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}