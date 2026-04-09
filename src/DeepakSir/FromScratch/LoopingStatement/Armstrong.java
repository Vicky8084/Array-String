package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to check Armstrong or Not :- ");
        int n=sc.nextInt();
        int cpy=n,rem=0,rev=0,count=0;
        while (cpy>0){
            cpy/=10;
            count++;
        }
        cpy=n;     //123
        while(cpy>0){
            rem=cpy%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power*=rem;
            }
            rev=rev+power;
            cpy/=10;
        }
        if(rev==n) System.out.println("Given Number "+n+" is Armstrong Number");
        else System.out.println("Given Number "+n+" is not Armstrong Number");
    }
}
