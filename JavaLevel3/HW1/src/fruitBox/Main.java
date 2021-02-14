package fruitBox;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        ArrayList<Apple> apples = new ArrayList<>(Arrays.asList(apple1, apple2));

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        ArrayList<Orange> oranges = new ArrayList<>(Arrays.asList(orange1, orange2));

        //коробки
        Box<Apple> applesBox = new Box<>();
        applesBox.addFruits(apples);

        Box<Orange> orangesBox = new Box<>();
        orangesBox.addFruits(oranges);



        applesBox.addFruit(apple3);
        System.out.println(applesBox.compareTo(orangesBox));
        if(applesBox.compareTo(orangesBox)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");
    }
}
