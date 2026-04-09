package DeepakSir.algorithms.PrefixAndSuffix;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr={4,5,3,7,2,-7,9,-8,1,-9};
        int[] suffixSum=new int[arr.length];
        suffixSum[suffixSum.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+arr[i];
        }

        System.out.print("Normal Array is :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.print("Prefix Sum Array is :- ");
        for(int i=0;i<suffixSum.length;i++){
            System.out.print(suffixSum[i]+", ");
        }
    }
}
