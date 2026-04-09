package DeepakSir.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;

public class FindDuplicateStringValue {
    public static void findDuplicateValueBruteForce(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println("Duplicate String is :- "+arr[i]+" at :- "+j);
                }
            }
        }
    }

    public static void findDuplicateValueHashSet(String[]arr){
        HashSet<String> set=new HashSet<>();
        System.out.print("Duplicate Strings are :- ");
        for(String key :arr){
            if(!set.contains(key)){
                set.add(key);
            }
            else System.out.print(key+", ");
        }
    }

    public static void findDuplicateValueHashMap(String [] arr){
        HashMap<String, Integer> map=new HashMap<>();
        for(String key : arr){
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else {
                map.put(key,map.get(key)+1);
            }
        }
        System.out.print("Duplicate values are ;- ");
        for(String key :map.keySet()){
            if(map.get(key)>1){
                System.out.print(key+", ");
            }
        }
    }
    public static void main(String[] args) {
        String []arr={"Vicky","Sunny","ansh","Amit","Vicky","Amit"};
       // findDuplicateValueBruteForce(arr);
        //findDuplicateValueHashSet(arr);
        findDuplicateValueHashMap(arr);
    }
}
