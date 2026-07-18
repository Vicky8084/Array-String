package SlidingWindow;

public class AverageOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr={5,6,3,4,8,2,3,9};
        int k=3,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        float avg= (float) sum / k;
        System.out.print("avg :- "+avg+" ");

        for(int i=1;i<=arr.length-k;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            avg=(float) sum/k;
            System.out.print(avg+" ");
        }

    }
}
