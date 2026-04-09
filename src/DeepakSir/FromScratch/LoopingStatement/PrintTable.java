package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to print its table :- ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" :- "+n*i);
        }
    }
}
