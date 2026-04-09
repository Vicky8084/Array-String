package DeepakSir.Programs;

import java.util.HashSet;

public class FindDuplicateIntegersBetweenTwoArrays {
    public static void duplicateElementsBruteForce(int [] arr1, int [] arr2){
        System.out.print("Duplicate Elements Between Two Arrays :- ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+", ");
                }
            }
        }
    }

    public static void duplicateElementsHashSet(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int key: arr1){
            set.add(key);
        }
        for (int key: arr2){
            if(set.contains(key)){
                result.add(key);
            }

        }
        System.out.print("Duplicate Elements Between Two Arrays :- "+result);
    }
    public static void main(String[] args) {
        int[] arr1={7,6,5,8,9,3};
        int[] arr2={1,2,3,4,5,10};
        duplicateElementsBruteForce(arr1,arr2);
        System.out.println();
        duplicateElementsHashSet(arr1,arr2);
    }
}
