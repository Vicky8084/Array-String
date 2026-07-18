package CotivityPrepration;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
       /* int[] arr={1,3,3,4,9,9,9,13,15,15};
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                i--;
                n--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr={1,3,3,4,9,9,9,13,15,15};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        for(Integer key : set){
            System.out.print(key+" ");
        }*/
        int[] arr={1,3,3,4,9,9,9,9,9,9,13,15,15};
        int i=1,j=1;
        while (i<arr.length){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
            i++;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
