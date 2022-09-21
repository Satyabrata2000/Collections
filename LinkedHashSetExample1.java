package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("String 1");
        set.add("String 2");
        set.add("String 3");
        set.add("String 4");
        set.add("String 5");
        set.add("String 3");

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
