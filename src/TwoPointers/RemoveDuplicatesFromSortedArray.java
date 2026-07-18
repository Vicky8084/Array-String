package TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,5,6,7,7,7,9};
        int k=0,n=arr.length;
        for(int i=0;i<n-1;i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        arr[k]=arr[n-1];
        k++;
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
