package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample1 {

    public static void main(String[] args) {

        Stack<String> sta = new Stack<String>();
        sta.push("String 1");
        sta.push("String 2");
        sta.push("String 3");
        sta.push("String 4");
        sta.push("String 5");
        sta.pop();

        Iterator<String> itr = sta.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
