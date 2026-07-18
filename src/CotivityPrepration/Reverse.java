package CotivityPrepration;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,7,6};
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
