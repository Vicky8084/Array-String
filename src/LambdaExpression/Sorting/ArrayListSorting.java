package LambdaExpression.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(8);
        list.add(2);
        list.add(10);
        System.out.println("Without Sorting :- "+list);
        Collections.sort(list);
        System.out.println("Using Collection Sorting :- "+list);
        Collections.sort(list,(a,b) -> b - a);
        System.out.println("Using Comparator Sorting :- "+list);
    }
}
