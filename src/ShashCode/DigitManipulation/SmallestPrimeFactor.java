package ShashCode.DigitManipulation;

public class SmallestPrimeFactor {
    public void smallestPrimeFactor(int num){
        if(num<2){
            System.out.println("Not any prime factor");
            return;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Smallest Prime Factor is :- "+i);
                return;
            }
        }
        System.out.println("Smallest Prime factor is :- " + num);
    }
    public static void main(String[] args) {
        SmallestPrimeFactor sf=new SmallestPrimeFactor();
        sf.smallestPrimeFactor(50);
    }
}
