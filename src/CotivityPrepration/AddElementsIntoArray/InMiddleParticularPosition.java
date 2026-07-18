package CotivityPrepration.AddElementsIntoArray;

public class InMiddleParticularPosition {
    public static void main(String[] args) {
        int[] arr={5,4,6,3,4,8,9,0};
        int pos=3,item=7;
        for(int i=arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=item;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
