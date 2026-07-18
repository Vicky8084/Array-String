package CotivityPrepration;

import java.util.HashMap;

public class PrintNonRepeatingElements {
    public static void main(String[] args) {
        int[] arr={4,3,2,9,7,0,2,7,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : arr){
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)==1){
                System.out.print(key+" ");
            }
        }
    }
}
