package TCSArray;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[]={0,1,2,1,2,4,5,4,6,7,3,4,2,3};
        int n=arr.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int element: arr){
            if(!map.containsKey(element)){
                map.put(element,1);
            }
            else{
                map.put(element,map.get(element)+1);
            }
        }
        for(Integer key: map.keySet()){
            System.out.println(key+" :- "+map.get(key));
        }
    }
}
