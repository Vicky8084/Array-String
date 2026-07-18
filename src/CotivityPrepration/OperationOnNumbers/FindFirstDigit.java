package CotivityPrepration.OperationOnNumbers;

public class FindFirstDigit {
    public static void main(String[] args) {
        int n =13543673;
        int cpy=n,rem=0,rev=0;
//        while(cpy>0){
//            rem = cpy%10;
//            rev=rev*10+rem;
//            cpy/=10;
//        }
//        System.out.println("Fist Digit is :- "+rev%10);

        while(n>=10){
            n/=10;
        }
        System.out.println(n);
    }
}
