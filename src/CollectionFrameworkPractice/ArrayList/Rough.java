package CollectionFrameworkPractice.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rough {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(45);
        list.add(65);
        list.add(22);
        list.add(87);
        list.add(2,41);
        System.out.println(list);
        list.set(1,5556);
        list.removeIf(num-> num%2==0);
        System.out.println(list);
    }
}
