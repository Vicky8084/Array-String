package DeepakSir.algorithms.PrefixAndSuffix;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={4,5,3,7,2,-7,9,-8,1-9};
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.print("Normal Array is :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.print("Prefix Sum Array is :- ");
        for(int i=0;i<prefixSum.length;i++){
            System.out.print(prefixSum[i]+", ");
        }
    }
}
