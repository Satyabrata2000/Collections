package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample4 {

    public static void main(String[] args) {

        //Sorting an ArrayList
        List<String> list1 = new ArrayList<String>();
        list1.add("String 1");
        list1.add("String 4");
        list1.add("String 2");
        list1.add("String 7");
        list1.add("String 5");

        Collections.sort(list1);
        for (String obj : list1) {
            System.out.println(obj);

        }
    }
}
