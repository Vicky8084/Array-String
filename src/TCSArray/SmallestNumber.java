package TCSArray;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[]={4,3,0,1,2};
        int n=arr.length;
        int small=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Smallest number is :- "+small);
    }
}
