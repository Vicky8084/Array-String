package Sorting;

public class MergeSorting {
    public static void mergeArray(int [] arr,int start,int mid,int end){
        int i=start,j=mid+1,endFirst=mid,endSecond=end, k=0;
        int size=(endFirst-i+1)+(endSecond-j+1);
        int[] brr=new int[size];
        while(i<=endFirst && j<=endSecond){
            if(arr[i]<arr[j]){
                brr[k]=arr[i];
                i++;
                k++;
            }
            else{
                brr[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=endFirst){
            brr[k]=arr[i];
            k++;
            i++;
        }
        while(j<=endSecond){
            brr[k]=arr[j];
            k++;
            j++;
        }
        k=0;
        for(int z=start;z<=end;z++){
            arr[z]=brr[k];
            k++;
        }
    }
    public static void mergeSort(int [] arr, int l, int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        //Split left Part
        mergeSort(arr,l,mid);
        //Split Right part
        mergeSort(arr,mid+1,r);
        mergeArray(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr={6,3,4,9,1,4,0,3};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
