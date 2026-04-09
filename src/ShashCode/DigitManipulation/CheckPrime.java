package ShashCode.DigitManipulation;

public class CheckPrime {
    public void checkPrime(int num){
        if(num<=1){
            System.out.println("Given Number is not prime Number");
            return;
        }
        int count=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Given Number is prime number");
        }
        else{
            System.out.println("Given Number is not Prime number");
        }
    }
    public static void main(String[] args) {
        CheckPrime cp=new CheckPrime();
        cp.checkPrime(91);
    }
}
