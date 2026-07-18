package TwoPointers;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,0,3,4,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
