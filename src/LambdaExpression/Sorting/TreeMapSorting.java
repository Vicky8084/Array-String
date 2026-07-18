package LambdaExpression.Sorting;

import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(4,"Vicky Gupta");
        map.put(3,"Sunny Gupta");
        map.put(2,"Ayush Ranjan");
        System.out.println("Actual Sorting :- "+map);

        TreeMap<Integer,String> map1 = new TreeMap<>((a, b)->b-a);
        map1.put(4,"Vicky Gupta");
        map1.put(3,"Sunny Gupta");
        map1.put(2,"Ayush Ranjan");
        System.out.println("Manual Sorting :- "+map1);
    }
}
