package TCSArray;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={4,3,0,1,2,6};
        int n=arr.length;
        int nums[]=new int[n];
//        for(int i=0;i<n;i++){
//            nums[n-1-i]=arr[i];
//        }
        System.out.println("Before reverse :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("\nAfter reverse :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
