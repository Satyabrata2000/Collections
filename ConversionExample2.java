package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Converting List to Array

public class ConversionExample2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");

        //Converting Arraylist to Array

        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Given List is " + Arrays.toString(array));
        System.out.println("Converted array is " + list);
    }
}
