package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to Prime or Not :- ");
        int n=sc.nextInt();
        if (n <= 1) {
            System.out.println("Given Number " + n + " is not Prime number");
            return;
        }

        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0) System.out.println("Given Number "+n+" is Prime number");
        else System.out.println("Given Number "+n+" is not Prime number");
    }
}
