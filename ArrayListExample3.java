package Collections;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {

        //Get and Set ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        System.out.println("Returning element: " + list.get(2));
        list.set(3, "String 0");
        for(String obj:list){
            System.out.println(obj);
        }
    }
}
