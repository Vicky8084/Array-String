package DeepakSir.Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateFromThreeArrays {
    public static void duplicateFromThreeArrays(int[] arr1, int[] arr2, int[] arr3){
        int a1=0,a2=0,a3=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (a1<arr1.length && a2<arr2.length && a3<arr3.length){
            if(arr1[a1]==arr2[a2] && arr1[a1]==arr3[a3]){
                list.add(arr1[a1]);
                a1++;
                a2++;
                a3++;
            }
            else if(arr1[a1]<arr2[a2]) a1++;
            else if(arr2[a2]<arr3[a3]) a2++;
            else a3++;
        }
        System.out.println("Duplicate Elements are :- "+list);
    }

    public static void main(String[] args) {
        int[] arr1={2,3,5,6,9};
        int[] arr2={1,2,5,7};
        int[] arr3={2,5,7,9,15,20};
        duplicateFromThreeArrays(arr1,arr2,arr3);
    }
}
