package TCSArray;

public class RemoveDuplicateFromUnsortedArray {
    public static void main(String[] args) {
        int arr[]={3,4,0,2,3,0,1,1,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
