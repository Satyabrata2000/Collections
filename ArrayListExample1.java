package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add(" ");
        list.add("String 4");
        list.add("String 2");

        //Traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
