package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list2.add(6);
        list2.add(9);
        list2.add(8);
        list2.add(10);
        list2.add(7);
        for(int i=0;i<list2.size();i++){
            list1.add(list2.get(i));
        }
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

    }
}
