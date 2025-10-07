package IBMPractice;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,-7,5,6,-8,-2,6,7,-2};
        int n=arr.length,maxSum=arr[0],currSum=arr[0];
        for(int i=1;i<n;i++){
            currSum += arr[i];

            if(currSum < arr[i]) {   // better to start fresh from arr[i]
                currSum = arr[i];
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("maxSUm :- "+maxSum);
    }
}
