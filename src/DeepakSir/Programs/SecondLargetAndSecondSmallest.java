package DeepakSir.Programs;

public class SecondLargetAndSecondSmallest {
    public static int secondLargest(int[] arr){
        int largest=0,secondLarget=0;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLarget=arr[1];
        }
        else{
            largest=arr[1];
            secondLarget=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                secondLarget=largest;
                largest=arr[i];
            }
            else if(secondLarget<largest && arr[i]>secondLarget){
                secondLarget=arr[i];
            }
        }
        return secondLarget;
    }
    public static int secondSmallest(int[] arr){
        int smallest=0,secondSmallest=0;
        if(arr[0]>arr[1]){
            smallest=arr[0];
            secondSmallest=arr[1];
        }
        else{
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (secondSmallest>smallest && arr[i]<secondSmallest) {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr={5,4,10,7,2,0,9,1,7};
        System.out.println("Second Larget Element is :- "+secondLargest(arr));
        System.out.println("Second Smallest Element is :- "+secondSmallest(arr));;
    }
}
