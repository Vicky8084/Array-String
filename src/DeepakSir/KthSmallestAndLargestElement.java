package DeepakSir;

import java.util.Scanner;

public class KthSmallestAndLargestElement {
    static int findKthLargest(int[] arr,int n,int largest){
        int i=0;
        for(i=0;i<n;i++){    //4,5,3,6,2
            for(int j=i;j<n-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            largest--;
            if(largest==0){
                break;
            }
        }
       return arr[i];
    }
    static int findKthSmallest(int[] arr,int n,int smallest){
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter which largest Element you want :- ");
        int largest=sc.nextInt();
        System.out.println("Enter which smallest Element you want :- ");
        int smallest=sc.nextInt();
        System.out.println(largest+"th Largest element is :- "+findKthLargest(arr,n,largest));
        System.out.println(smallest+"th smallest element is :- "+findKthSmallest(arr,n,smallest));
    }
}
