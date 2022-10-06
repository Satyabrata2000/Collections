package Collections;

//Collections example

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        Collections.addAll(list, "5", "6");
        System.out.println(list);
        String[] str = {"a", "b"};
        Collections.addAll(list, "f", "g");
        System.out.println(list);
    }


}
