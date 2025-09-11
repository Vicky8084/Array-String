package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of Row :- ");
        int r=sc.nextInt();
        System.out.print("Enter limit of Column :- ");
        int c=sc.nextInt();
        System.out.println("Enter Elements :- ");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter value of ["+i+"th] Row and ["+j+"th] Column :- ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Elements are :- ");
        int odd=0,even=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]%2==0){
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();
        }
        System.out.println("Even Elements are :- "+even+"\nOdd Elements are :- "+odd);
    }
}
