package DeepakSir.Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={3,9,1,10,4,20,2};
       HashSet<Integer> set=new HashSet<>();
       ArrayList<Integer> longestList=new ArrayList<>();
       for(int key : arr){
           set.add(key);
       }
       int size=0;
       for (int key : arr){
           if(!set.contains(key-1)){
               int value=key;
               ArrayList<Integer> tempList=new ArrayList<>();
               while (set.contains(value)){
                   tempList.add(value);
                   value++;
               }
               if(size<value-key){
                   size=value-key;
                   longestList=tempList;
               }
           }
       }
        System.out.println("Size of Longest Subsequence is :- "+size);
        System.out.println("Longest Subsequence is :- "+longestList);
    }
}
