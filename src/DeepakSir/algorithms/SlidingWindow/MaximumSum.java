package DeepakSir.algorithms.SlidingWindow;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr={100,48,82,57,34,112,65};
        int windowSize=3,windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=arr[i];
        }
        int maximumSum=windowSum;
        for(int i=1;i<=arr.length-windowSize;i++){
            windowSum=windowSum-arr[i-1]+arr[i+windowSize-1];
            if(maximumSum<windowSum){
                maximumSum=windowSum;
            }
        }
        System.out.println("Maximum sum :- "+maximumSum);
    }
}
