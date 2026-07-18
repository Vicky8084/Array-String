package CotivityPrepration;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr={3,5,4,9,1,2,0,7};
        if(arr.length<2){
            System.out.println("We can't Compare");
            return;
        }
        int smallest=0,secondSmallest=0;
        if(arr[0]<=arr[1]){
            smallest=arr[0];
            secondSmallest=arr[1];
        }else{
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest=arr[i];
            }
        }
        if(smallest==secondSmallest){
            System.out.println("Both are are not Distinct");
            return;
        }
        System.out.println("Smallest :- "+smallest+"\nSecondSmallest :- "+secondSmallest);
    }
}
