package IBMPractice;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};
        int n=arr.length+1;
        int rslt=n*(n+1)/2,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Missing number is :- "+(rslt-sum));
    }
}
