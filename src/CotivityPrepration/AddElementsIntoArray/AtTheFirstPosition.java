package CotivityPrepration.AddElementsIntoArray;

public class AtTheFirstPosition {
    public static void main(String[] args) {
        int[] arr={6,5,4,5,6,7,0};
        int item=2;
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=item;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
