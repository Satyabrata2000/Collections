package Collections;

//Difference between collection and collections

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("4");
        list.add("1");
        System.out.println(list);
        Collections.addAll(list,"3", "4");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
