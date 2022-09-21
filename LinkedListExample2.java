package Collections;

import java.util.LinkedList;

public class LinkedListExample2 {

    public static void main(String[] args) {

        //LinkedList example to add elements
        LinkedList<String> test = new LinkedList<String>();
        test.add("String 1");
        test.add("String 2");
        test.add("String 3");
        test.add("String 4");
        System.out.println("Initial list of elements is: " + test);
        test.add(1, "String 0");
        System.out.println("After invoking add method: " + test);
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("String 5");
        list2.add("String 6");
        System.out.println(list2);
    }
}
