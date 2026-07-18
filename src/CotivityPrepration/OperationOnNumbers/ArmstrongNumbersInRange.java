package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Starting Point :- ");
        int start=scanner.nextInt();
        System.out.print("Enter Ending Point :- ");
        int end=scanner.nextInt();
        for(int i=start;i<=end;i++){
            if(armstrong(i)==i){
                System.out.print(i+" ");
            }
        }
    }
    public static int armstrong(int n){
        int armstrong=0,digit=count(n);
        while(n>0){
            int rem=n%10;
            armstrong+=(int)Math.pow(rem,digit);
            n/=10;
        }
        return armstrong;
    }
    public static int count(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
