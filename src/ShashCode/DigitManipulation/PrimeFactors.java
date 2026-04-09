package ShashCode.DigitManipulation;

public class PrimeFactors {
    public void findPrimeFactors(int num){
        System.out.print("Prime Factors are :- ");
        for(int i=2;i<=Math.sqrt(num);i++){
            while (num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
        }
        if(num>1){
            System.out.println(num);
        }
    }

    public void findPrimeFactorsOptimized(int num){
        System.out.print("\nPrime Factors are :- ");
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.print(i+" ");
                while (num%i==0){
                    num/=i;
                }
            }
        }
        if(num>1){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        PrimeFactors pf=new PrimeFactors();
        pf.findPrimeFactors(37);
        pf.findPrimeFactorsOptimized(37);
    }
}
