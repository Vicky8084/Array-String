package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to Check if it is Armstrong or not :- ");
        int n = scanner.nextInt();
        int cpy=n,count=0;
        while(cpy>0){
            count++;
            cpy/=10;
        }
        cpy=n;
        int sum=0;
        while(cpy>0){
            int rem = cpy%10,flag=1;

            //sum+=(int)Math.pow(rem,count);
            for(int i=0;i<count;i++){
                flag*=rem;
            }
            sum+=flag;
            cpy/=10;
        }
        if(sum==n){
            System.out.println("Given Number is armstrong number");
        }else{
            System.out.println("Given Number is not armstrong number");
        }
    }
}
