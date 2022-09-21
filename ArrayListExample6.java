package Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//remove duplicates from arraylist

public class ArrayListExample6 {

    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();
        str.add("String 1");
        str.add("String 2");
        str.add("String 3");
        str.add("String 1");
        str.add("String 4");
        System.out.println(str.toString());
        Set<String> str2 = new LinkedHashSet<String>(str);
        System.out.println(str2);
    }
}
