package CotivityPrepration;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        /*int[] arr={3,1,3,4,4,5,1,9,3,2,3,1,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int freq=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i]+" :- "+freq);
        }*/
        int[] arr={3,1,3,4,4,5,1,9,3,2,3,1,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key+" :- "+map.get(key));
        }
    }
}
