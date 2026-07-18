package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n=scanner.nextInt();
        // n -> 10 => 1,2,5,10
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
