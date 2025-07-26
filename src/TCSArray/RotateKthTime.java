package TCSArray;

public class RotateKthTime {
    public static void main(String[] args) {
        int arr[]={4,0,3,1,2};
        int k=3,n=arr.length;
        while(k!=0){
            k--;
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
