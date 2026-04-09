package CollectionFrameworkPractice.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(45);
        set.add(32);
        set.add(98);
        set.removeIf(num-> num%2==0);
        System.out.println(set);
    }
}
