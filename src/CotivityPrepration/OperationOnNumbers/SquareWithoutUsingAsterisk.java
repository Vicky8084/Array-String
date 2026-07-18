package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class SquareWithoutUsingAsterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to find its square :- ");
        int n=scanner.nextInt();
        int result = 0;
        for(int i=1;i<=n;i++){
            result+=n;
        }
        System.out.println("Square is :- "+result);

    }
}
