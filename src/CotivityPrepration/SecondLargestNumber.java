package CotivityPrepration;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr={3,5,4,7,6,5,9,8,12};
        int largest=0,secondLargest=0;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
        }else {
            largest=arr[1];
            secondLargest=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i] > secondLargest && arr[i]<largest) {
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest :- "+largest+"\nSecondLargest :- "+secondLargest);
    }
}
