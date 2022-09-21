package Collections;

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");

        //Traversing through for-each loop
        for(String obj:list){
            System.out.println(obj);
        }
    }
}
