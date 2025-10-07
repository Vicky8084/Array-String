package IBMPractice;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={5,6,3,1,0,7,4};
        int smallest=0,secondSmallest=0;
        if(arr[0]>arr[1]){
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        else{
            smallest=arr[0];
            secondSmallest=arr[1];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]>smallest && arr[i]<secondSmallest) {
                secondSmallest=arr[i];
            }
        }
        System.out.println("\nSmallest :- "+smallest+"\nsecond smallest :- "+secondSmallest);
    }
}
