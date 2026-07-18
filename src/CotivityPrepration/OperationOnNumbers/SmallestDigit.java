package CotivityPrepration.OperationOnNumbers;

public class SmallestDigit {
    public static void main(String[] args) {
        int n = 4352677;
        int min=Integer.MAX_VALUE;
        while(n>0){
            int rem=n%10;
            if(min>rem){
                min=n%10;
            }
            n/=10;
        }
        System.out.println(min);
    }
}
