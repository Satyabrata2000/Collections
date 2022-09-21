package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Converting from ArrayList to Array

public class ConversionExample3 {

    public static void main(String[] args) {

        //creating an ArrayList
        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        String[] item = list.toArray(new String[list.size()]);
        for(String s : item){
            System.out.println(s);
        }

        //Converting array to arraylist
        List<String> list2 = new ArrayList<>();
        list2 = Arrays.asList(item);
        System.out.println(list2);
    }
}
