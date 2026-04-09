package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number till to Count Total Number of Prime Numbers :- ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            int count1=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count1++;
                }
            }
            if(count1==0){
                count++;
            }
        }
        System.out.println("Total Number of Prime Number :- "+count);
    }
}
