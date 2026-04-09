package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class CountElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        int count=0;
        for(int i=0;i<list.size();i++){
            count++;
        }
        System.out.println("total Elements is :- "+count);
        System.out.println("total Elements is :- "+list.size());
        int n=list.size();
        System.out.println("total Elements is :- "+n);
    }
}
