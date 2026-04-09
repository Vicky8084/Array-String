package Algorithms.WindowSliding;
public class MaxOfSubArray {
    public static void main(String[] args) {
        int [] arr={48,47,100,200,120,50,25};
        int n=arr.length;
        int windowSize=3,windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=arr[i];
        }
        int maxWindowSum=windowSum;
        for(int i=1;i<=n-windowSize;i++){
            windowSum=windowSum-arr[i-1]+arr[i+windowSize-1];
            if(windowSum>maxWindowSum) maxWindowSum=windowSum;
        }
        System.out.println(maxWindowSum);
    }
}
