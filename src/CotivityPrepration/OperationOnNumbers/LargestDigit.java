package CotivityPrepration.OperationOnNumbers;

public class LargestDigit {
    public static void main(String[] args) {
        int n=123423;
        int max=Integer.MIN_VALUE;
        while(n>0){
            if(n%10>max){
                max=n%10;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
