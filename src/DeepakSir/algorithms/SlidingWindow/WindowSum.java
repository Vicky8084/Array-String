package DeepakSir.algorithms.SlidingWindow;

public class WindowSum {
    public static void main(String[] args) {
        int[] arr={100,48,82,57,34,112,65};
        int windowSize=3,windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=arr[i];
        }

        for(int i=1;i<=arr.length-windowSize;i++){
            windowSum=windowSum-arr[i-1]+arr[i+windowSize-1];
        }
        System.out.println("Sum is :- "+windowSum);
    }
}
