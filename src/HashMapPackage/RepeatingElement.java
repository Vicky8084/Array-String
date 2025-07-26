package HashMapPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatingElement {
    public static void main(String[] args) {
        int []arr={4,3,0,0,3,2,1,4,2,4,5,3,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element :arr){
            if(!map.containsKey(element)){
                map.put(element,1);
            }
            else {
                map.put(element,map.get(element)+1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key: map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        System.out.print("Elements are :- ");
        for(int element :list){
            System.out.print(element+" ");
        }
    }
}
