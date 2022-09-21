package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Converting array to list

public class ConversionExample1 {

    public static void main(String[] args) {

        String[] array = {"String 1", "String 2", "String 3"};
        System.out.println("Given array is " + Arrays.toString(array));

        List<String> list = new ArrayList<>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Converted List is " + list);
    }
}
