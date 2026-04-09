package comparator;

import com.sun.source.tree.TreeVisitor;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetNaturalSorting {
    public static void main(String[] args) {
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return -1;
                } else if (o1==o2) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        };

        TreeSet<Integer> treeSet=new TreeSet<>(comparator);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(0);
        treeSet.add(-4);
        treeSet.add(3);
        System.out.println(treeSet);
    }
}
