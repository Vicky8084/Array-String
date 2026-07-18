package CotivityPrepration.OperationOnNumbers;

public class RemoveFirstDigit {
    public static void main(String[] args) {
        int n=23452;
        System.out.println("Before Removed First Digit :- "+n);
        int reversed = reverse(n);  //853543
        reversed = reversed/10;
        reversed=reverse(reversed);
        System.out.println("After Removed First Digit :- "+reversed);


    }
    public static int reverse(int n){
        int rem=0,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
