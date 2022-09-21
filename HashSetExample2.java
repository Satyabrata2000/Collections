package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Java HashSet from another collection

public class HashSetExample2 {

    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");

        HashSet<String>set = new HashSet<>(list);
        set.add("String 4");
        set.add("String 5");

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
