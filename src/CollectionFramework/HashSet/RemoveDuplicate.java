package CollectionFramework.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        for(int i=0;i<list.size();i++){
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
            }
        }
        for(Integer key: set){
            System.out.print(key+" ");
        }
    }
}
