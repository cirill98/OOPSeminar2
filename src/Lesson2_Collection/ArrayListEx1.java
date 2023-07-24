package Lesson2_Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ciri");
        arrayList1.add("asd");
        arrayList1.add("fbshr");

        for (String str: arrayList1) {
            System.out.println(str);
        }

    }
}
