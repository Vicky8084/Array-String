package TCSArray;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={2,9,3,0,1,2,8};
        int smallest,secondSmallest, n=arr.length;
        if(arr[0]<arr[1]){
            smallest=arr[0];
            secondSmallest=arr[1];
        }
        else{
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println("smallest and Second smallest elements are :- "+smallest+" "+secondSmallest);
    }
}
