package LambdaExpression.Sorting;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(2);
        set.add(8);
        System.out.println("Actual Sorting :- "+set);
        TreeSet<Integer> set1 = new TreeSet<>((a,b)-> b-a);
        set1.add(6);
        set1.add(2);
        set1.add(8);
        System.out.println("Manual Sorting :- "+set1);
    }
}
