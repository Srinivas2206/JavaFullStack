package JavaCollections.list;
/*
 *Create an ArrayList that can store only Strings.
 *Create a printAll method that will print all the elements of the ArrayList using an Iterator. 
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Sample1 {
    public static void main(String[] args) {
        ArrayList<String> sr = new ArrayList<>();
        sr.add("abc");
        sr.add("def");
        sr.add("ghi");
        sr.add("xyz");

        printAll(sr);
    }

    static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
