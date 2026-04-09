package Algorithms.Kadane;
public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr={2,-5,1,7,-3,4,-6};
        int currSum=0, max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>max) max=currSum;
            if(currSum<0) currSum=0;
        }
        System.out.println("Maximum SubArray Sum is :- "+max);
    }
}


