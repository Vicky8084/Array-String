package HashMapPackage;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,2,3,4,4,5,6,6,7,7,8,8};
        int k=arr.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int element : arr){
            if(!map.containsKey(element)){
                map.put(element,1);
            }
        }
        System.out.println("After removed duplicate Using HashMap..!!");
        for(Integer key: map.keySet()){
            System.out.print(key+" ");
        }

        for(int element:arr){
            if(!set.contains(element)){
                set.add(element);
            }
        }
        System.out.println("\nAfter removed duplicate Using HashSet..!!");
        for(Integer key :set){
            System.out.print(key+" ");
        }
    }
}
