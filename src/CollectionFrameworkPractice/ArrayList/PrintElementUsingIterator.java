package CollectionFrameworkPractice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintElementUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(65);
        list.add(22);
        list.add(87);
        list.add(45);
        list.add(65);
        list.add(22);
        list.add(87);
        System.out.println(list.indexOf(22));
        for(Integer e:list){
            System.out.print(e+" ");
        }
        System.out.println();
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
