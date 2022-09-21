package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<String>();
        li.add("String 3");
        li.add("String 4");
        li.add(" ");
        li.add("String 5");
        li.add("String 6");
        li.add("String 6");

        //Traversing list through iterator
        Iterator<String> itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
