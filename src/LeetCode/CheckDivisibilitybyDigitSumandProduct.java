package LeetCode;

public class CheckDivisibilitybyDigitSumandProduct {
    public static void main(String[] args) {
        int n=99;
        int sum=0,product=1,rev,cpy=n;
        while(cpy!=0){
            rev=cpy/10;
            cpy=cpy/10;
            sum=sum+rev;
            product=product*rev;
        }
        if((sum+product)==n){
            System.out.println("True");
            return ;
        }
        System.out.println("false");
    }
}
