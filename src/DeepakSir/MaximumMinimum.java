package DeepakSir;
import java.util.Scanner;
public class MaximumMinimum {
    static int[] findMinimumMaximum(int[] arr, int n){
        int min=arr[0],max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of an array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\nElements are :- ");
        for(int val : arr){
            System.out.print(val+" ");
        }
        int minMax[]=findMinimumMaximum(arr,n);
        System.out.print("\nMinimum values is :- "+minMax[0]);
        System.out.print("Maximum values is :- "+minMax[1]);
    }
}
