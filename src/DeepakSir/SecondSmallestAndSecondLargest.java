package DeepakSir;
import java.util.Scanner;
public class SecondSmallestAndSecondLargest {
    static int findSecondLargest(int[] arr,int n){
        int largest,secondLargest;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
        }
        else{
            largest=arr[1];
            secondLargest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    static int findSecondSmallest(int [] arr,int n){
        int smallest,secondSmallest;
        if(arr[0]<arr[1]){
            smallest=arr[0];
            secondSmallest=arr[1];
        }
        else {
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
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
        System.out.println("\nSecond Largest is :- "+findSecondLargest(arr,n));
        System.out.println("Second Smallest is :- "+findSecondSmallest(arr,n));
    }
}
