package TCSArray;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={2,9,3,0,1,2,8};
        int largest,secondLargest, n=arr.length;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
        }
        else{
            largest=arr[1];
            secondLargest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("largest and Second Largest elements are :- "+largest+" "+secondLargest);
    }
}
