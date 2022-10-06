package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Example to sort string objects
public class CollectionsExample4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("f");
        al.add("s");
        al.add("h");
        al.add("y");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(al, Collections.reverseOrder());
        Iterator itr2 = al.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
