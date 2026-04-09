package ShashCode.DigitManipulation;

public class PrintAllDivisors {
    public void printAllDivisors(int num){
        int sqrt=(int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
           if(num%i==0){
               if(i==num/i){
                   System.out.print(" "+i+" ");
               }
               else{
                   System.out.print(" "+i+" "+num/i);
               }
           }
        }
    }
    public static void main(String[] args) {
        PrintAllDivisors pd=new PrintAllDivisors();
        pd.printAllDivisors(36);
    }
}
