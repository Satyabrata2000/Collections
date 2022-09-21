package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("String 1");
        set.add("String 2");
        set.add("String 3");
        set.add("String 4");
        set.add("String 1");
        set.add("String 2");
        set.add("String 5");
        set.add("String 6");

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
