package convertArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
    public static <T> List<T> convertArrayToList(T array[])
    {
        List<T> list = new ArrayList<>();

        for(T t:array) {
            list.add(t);
        }

        return list;
    }

    public static void main(String args[])
    {
        String array[] = {" Moscow", "Saint-Petersburg", "Volgograd","Omsk"};

        System.out.println("Array: " + Arrays.toString(array));

        List<String> list = convertArrayToList(array);

        System.out.println("List: " + list);
    }
}
