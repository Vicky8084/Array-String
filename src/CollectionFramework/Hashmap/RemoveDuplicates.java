package CollectionFramework.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
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
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i),1 );
            }
            else {
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        }
        for(Integer key: map.keySet()){
            System.out.print(key+" ");
        }
    }
}
