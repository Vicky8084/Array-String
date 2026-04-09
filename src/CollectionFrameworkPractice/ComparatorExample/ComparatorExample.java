package CollectionFrameworkPractice.ComparatorExample;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator=(i,j)->{
            return j.compareTo(i);
        };
        SortedSet<Integer> set=new TreeSet<>(comparator);
        set.add(34);
        set.add(13);
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println(set);
        System.out.println(set.comparator());
    }
}
