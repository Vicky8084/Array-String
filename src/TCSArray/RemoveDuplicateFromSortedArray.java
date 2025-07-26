package TCSArray;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,2,3,4,4,5,6,6,7,7,8,8};
        int k=arr.length;
        int n=k;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
