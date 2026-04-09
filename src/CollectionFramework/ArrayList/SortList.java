package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)> list.get(i+1)){
                int temp= list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1,temp);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}