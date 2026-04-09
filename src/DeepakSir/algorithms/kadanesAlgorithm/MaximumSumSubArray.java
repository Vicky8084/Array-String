package DeepakSir.algorithms.kadanesAlgorithm;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={4,-2,-3,4,-1,-2,5,-3};
        int currSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Maximum Sum of SubArray is :- "+maxSum);
    }
}
