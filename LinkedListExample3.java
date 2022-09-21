package Collections;

import java.util.LinkedList;

public class LinkedListExample3 {

    //LinkedList example to remove elements

    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList<String>();
        test.add("String 0");
        test.add("String 1");
        test.add("String 2");
        test.add("String 3");
        test.add("String 0");
        test.add("String 1");
        test.add("String 2");
        test.add("String 3");
        System.out.println("Initial list of elements is " + test);
        test.remove("String 2");
        System.out.println("After invoking remove method " + test);
        test.remove(4);
        System.out.println("After invoking index removal " + test);
    }
}
