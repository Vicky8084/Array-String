package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check it is Strong or not :- ");
        int n=scanner.nextInt();
        if(strong(n)==n){
            System.out.println("Given Number is Strong Number");
        }else{
            System.out.println("Given Number is Not Strong Number");
        }
    }
    // n -> 145
    public static int strong(int n){
        int sum=0;
        while(n>0){
            sum+=factorial(n%10);
            n/=10;
        }
        return sum;
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
