package Collections;

// length of array and size() of arraylist

import java.util.ArrayList;

public class ArrayExample1 {

    public static void main(String[] args) {

        //creating an array of 10 elements
        int arr[] = new int[10];
        //storing 2 elements
        arr[0] = 10;
        arr[1] = 12;
        //printing length of array
        System.out.println(arr.length);


        //creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        //Storing 2 elements
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        //printing size of arraylist
        System.out.println(list.size());
    }
}
