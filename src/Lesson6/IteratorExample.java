package Lesson6;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Dog");
        arrayList1.add("Cat");
        arrayList1.add("Flog");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
