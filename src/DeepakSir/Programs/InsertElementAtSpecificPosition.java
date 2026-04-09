package DeepakSir.Programs;

import java.util.Scanner;

public class InsertElementAtSpecificPosition {
    static Scanner sc=new Scanner(System.in);
    public int[] insertElementAtSpecificPosition(int[] arr){
        System.out.print("Enter the Specific Position to insert element in the list :- ");
        int pos=sc.nextInt(),n=arr.length;

        return arr;
    }
    public static void main(String[] args) {
        System.out.print("Enter Size of an Array :- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array without Operation Performed :- ");
        for(int key : arr){
            System.out.print(key+", ");
        }

    }
}
