package DeepakSir.Programs;

import java.util.HashMap;
import java.util.HashSet;

public class FirstDuplicateInteger {
    public static void firstDuplicateIntegerBruteForce(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First Duplicate Element is :- "+arr[i]+" at :- "+j);
                    return;
                }
            }
        }
    }

    public static void firstDuplicateIntegerHashSet(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int key : arr){
            if(!set.contains(key)){
                set.add(key);
            }
            else{
                System.out.println("First Duplicate Element is :- "+key);
                return;
            }
        }
    }

    public static void firstDuplicateIntegerHashMap(int [] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int key : arr){
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                System.out.println("First Duplicate Element is :- "+key);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,3,1,6,15,7};
        //firstDuplicateIntegerBruteForce(arr);
//        firstDuplicateIntegerHashSet(arr);
        firstDuplicateIntegerHashMap(arr);
    }
}
