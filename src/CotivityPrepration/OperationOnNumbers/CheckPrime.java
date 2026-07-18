package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to Check Prime or Not :- ");
        int n=scanner.nextInt(),count=0;
        if(n<2){
            System.out.println("Not Prime");
            return;
        }
        for (int i =2 ;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
