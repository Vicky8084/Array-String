package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any Number to Check Perfect Number :- ");
        int n=scanner.nextInt(); // n -> 10 => 1,2,5,10
        int flag = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                flag+=i;
            }
        }
        if(flag==n){
            System.out.println("Given Number is Perfect Number");
        }else{
            System.out.println("Given Number is Not Perfect Number ");
        }
    }
}
