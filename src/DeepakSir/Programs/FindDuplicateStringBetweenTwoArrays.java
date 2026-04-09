package DeepakSir.Programs;

import java.util.HashSet;

public class FindDuplicateStringBetweenTwoArrays{

    public static void findDuplicateStringBetweenTwoArraysHahSet(String[] arr1, String[] arr2){
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> result=new HashSet<>();
        for(String key: arr1){
            set1.add(key);
        }

        for(String key : arr2){
            if(set1.contains(key)){
                result.add(key);
            }
        }
        System.out.println("Duplicate String Between Two Arrays :- "+result);
    }

    public static void main(String[] args) {
        String[] arr1={"Vicky","Sunny","Aman","Rohan","Amit"};
        String[] arr2={"Rohan","Sohan","Aman","Vikash"};
        findDuplicateStringBetweenTwoArraysHahSet(arr1,arr2);
    }
}
