package DeepakSir.Programs;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateIntegerValue {
    public static void duplicateValueBruteForce(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate value is :- "+arr[i]+" at :- "+j);
                }
            }
        }
    }

    public static void duplicateValueHashSet(int []arr){
        HashSet<Integer> set=new HashSet<>();
//       for(int i=0;i<arr.length;i++){
//           if(!set.contains(arr[i])){
//               set.add(arr[i]);
//           }
//           else{
//               System.out.println("Duplicate value is :- "+arr[i]+" at :- "+i);
//           }
//       }
        System.out.print("Duplicate values are :- ");
        for(int key:arr){
            if(set.add(key)==false){
                System.out.print(key+", ");
            }
        }
    }

    public static void findDuplicateValueHashMap(int[]arr){
        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//            }
//            else{
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//        }

        for(int key :arr){
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
                //System.out.print(key+", ");
            }
        }
        System.out.print("Duplicate values are :- ");
        for(Integer key : map.keySet()){
            if(map.get(key)>1){
                System.out.print(key+", ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,6,4,3,5,8,9,3,5};
        duplicateValueBruteForce(arr);
        System.out.println();
        duplicateValueHashSet(arr);
        System.out.println();
        findDuplicateValueHashMap(arr);

    }
}
