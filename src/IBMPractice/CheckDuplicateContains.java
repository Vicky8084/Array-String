package IBMPractice;

import java.util.HashMap;

public class CheckDuplicateContains {
    public static void main(String[] args) {
//        int []arr={4,5,6,3,0,9,2,3};
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length-1;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                    break;
//                }
//
//            }
//        }
//        if(count==1){
//            System.out.println("duplicate found..!!");
//        }
//        else {
//            System.out.println("not found");
//        }

        int []arr={4,5,6,3,0,9,2};
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int count=0;
        for(Integer key : map.keySet()){
            if(map.get(key)>1){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("duplicate found..!!");
        }
        else {
            System.out.println("not found");
        }

    }
}
