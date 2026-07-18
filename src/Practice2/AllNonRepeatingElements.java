package Practice2;

import DeepakSir.algorithms.PrefixAndSuffix.DivideArrayInTwoSubarrayWithEqualSum;

import java.util.HashMap;

public class AllNonRepeatingElements {
    public static void main(String[] args) {
        int[] arr={3,4,5,3,5,3,1,4,7,8,2,12,13};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)==1){
                System.out.print(key+" ");
            }
        }
    }
}
