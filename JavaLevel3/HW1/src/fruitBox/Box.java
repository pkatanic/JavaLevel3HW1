package fruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();
    private float weight;


    public Box() {
        weight=0;
    }


    public boolean compareTo(Box<? extends Fruit> other){
        return getWeight() > other.getWeight();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if(fruits.size() == 0) return 0;
        float weight = 0;
        for (T fruit: fruits) {
            weight = weight+fruit.getWeight();
        }
        return weight;
    }

    public void addFruits(ArrayList<? extends T> fruits){
        for (T fruit : fruits) {
            this.fruits.add(fruit);
            weight += fruit.getWeight();
        }
    }
    public void addFruit(T fruit) {
        fruits.add(fruit);
        weight += fruit.getWeight();
    }
    private void clear() {
        fruits.clear();
    }
    void shift(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }

}
