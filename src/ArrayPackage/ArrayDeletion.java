package ArrayPackage;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of an Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter Elements in the Array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nElements before Deletion  :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        char ch;
        do{
            System.out.print("\nEnter Position from where you want to delete :- ");
            int pos= sc.nextInt();
            for(int i=pos-1;i<n;i++){
                arr[i]=arr[i+1];
            }
            n--;

            System.out.print("\nElements After Deletion  :- ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("\nDo you want to Delete again (y/n) :- ");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}
