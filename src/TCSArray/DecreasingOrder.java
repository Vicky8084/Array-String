package TCSArray;

public class DecreasingOrder {
    public static void main(String[] args) {
        int arr[]={4,3,0,1,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
