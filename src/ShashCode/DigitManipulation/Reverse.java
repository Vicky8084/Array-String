package ShashCode.DigitManipulation;

public class Reverse {
    public void reverseNumber(int num){
        if(num==0){
            System.out.println("Reverse is :- "+0);
            return;
        }
        int rev=0,rem=0;
        boolean isNeg=false;
        if(num<0){
            num=-1*num;
            isNeg=true;
        }
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(isNeg){
            rev=-1*rev;
        }
        System.out.println("Reverse is :- "+rev);
    }
    public static void main(String[] args) {
        Reverse rv=new Reverse();
        rv.reverseNumber(0);
    }
}
