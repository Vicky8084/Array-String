package CotivityPrepration.OperationOnNumbers;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PrintPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Starting Point to Print Prime Number :- ");
        int start=scanner.nextInt();
        System.out.print("Enter Ending Point to Print Prime Numbers :- ");
        int end=scanner.nextInt();

        //start -> 10 , end -> 30 => (11,12,17,19,23,29)

        for(int i=start;i<=end;i++){
            if(i<2){
                continue;
            }
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }

    }
}
