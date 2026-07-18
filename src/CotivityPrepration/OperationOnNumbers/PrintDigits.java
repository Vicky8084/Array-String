package CotivityPrepration.OperationOnNumbers;

public class PrintDigits {
    public static void main(String[] args) {
        int k = 123345;
        int n=0,rem=0;
        while(k>0){
            rem=k%10;
            n=n*10+rem;
            k/=10;
        }
        while (n>0){
            System.out.print(n%10+" ");
            n/=10;
        }
    }
}
