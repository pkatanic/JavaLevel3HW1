package swapElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        Integer[] intArray = {1,2,3,4,5};

        System.out.println(list);
        System.out.println(Arrays.toString(intArray));

        Collections.swap(list, 1, 2);

        swap(intArray,1,2);

        System.out.println(list);
        System.out.println(Arrays.toString(intArray));
    }
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
