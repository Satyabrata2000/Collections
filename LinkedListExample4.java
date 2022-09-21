package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample4 {

    //Reverse a list of elements

    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("String 1");
        obj.add("String 2");
        obj.add("String 3");

        //Traversing the list of elements in reverse order

        Iterator i = obj.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
