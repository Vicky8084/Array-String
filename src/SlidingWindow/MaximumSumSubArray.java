package SlidingWindow;

public class MaximumSumSubArray {
    public static void main(String[] args) {
       int[] arr={2,1,5,1,3,2};
       int sum=0,target=3;
       for(int i=0;i<target;i++){
           sum+=arr[i];
       }
       int maxSum=sum;

       int si=0,ei=0;
       for(int i=1;i<=arr.length-target;i++){
           sum=sum-arr[i-1]+arr[i+target-1];
           if(sum>maxSum){
               si=i;
               ei=i+target-1;
               maxSum=sum;
           }
       }
        System.out.println("Maximum Sum SubArray is :- "+maxSum+" from -> "+si+" and "+ei);
    }
}
