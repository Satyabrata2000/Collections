package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample1 {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();
        vec.add("String 1");
        vec.add("String 2");
        vec.add("String 3");
        vec.add("String 1");
        vec.add("String 4");

        Iterator<String> itr = vec.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
