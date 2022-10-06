package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//finding the max in the list
public class CollectionsExample3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(21);
        list.add(11);
        list.add(54);
        list.add(8);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
