package DeepakSir.Programs;

public class MissingNumber {
    public static void missingNumberUsingMathmatics(int[] arr){
        int expectedSum=arr.length+1;  //1,2,3,5,6 -> length=6
        int totalSum=(expectedSum*(expectedSum+1))/2;  // totalSum= 6*(6+1)/2 ->21
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Missing Number is :- "+(totalSum-sum));

    }
    public static void missingNumberUsingBitManipulation(int[] arr){
        int n=arr.length;
        int xor=0;
        for(int key : arr){
            xor ^=key;
        }
        for(int i=0;i<=n;i++){
            xor ^=i;
        }
        System.out.println("Missing Number is :- " +xor);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        missingNumberUsingMathmatics(arr);
        //missingNumberUsingBitManipulation(arr);
    }
}
