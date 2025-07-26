package LeetCode;

public class DuplicateZero {
    public static void main(String[] args) {
        int []arr={1,0,2,3,0,4,5,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int k=n-1;k>i;k--){
                    arr[k]=arr[k-1];
                }
                i++;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
