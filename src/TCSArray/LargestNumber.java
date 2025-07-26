package TCSArray;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={4,3,0,1,2,8};
        int n=arr.length,max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest number is :- "+max);
    }
}
