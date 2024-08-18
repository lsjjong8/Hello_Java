package chapter09.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitBoxEx4 { //
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o2.weight - o1.weight;
            }
        });
        Collections.sort(grapeBox.getList(), (o1, o2) -> o2.weight - o1.weight);

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
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
    String name;
    int weight;
    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple extends Fruit {
    public Apple(String name, int weight) {
        super(name, weight);
    }
}

class Grape extends Fruit {
    public Grape(String name, int weight) {
        super(name, weight);
    }
}

class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.weight - o2.weight;
    }
}
