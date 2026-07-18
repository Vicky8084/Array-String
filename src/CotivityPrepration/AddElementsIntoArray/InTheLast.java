package CotivityPrepration.AddElementsIntoArray;

public class InTheLast {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,4,5,6,0};
        int item=23;
        arr[arr.length-1]=item;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
