package ShashCode.DigitManipulation;

public class TrailingZeroInFactorial {
    public void trailingZeroInFactorial(int num){
        int result=0;
        int i=5;
        while (i<=num){
            result=result+num/i;
            i=i*5;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        TrailingZeroInFactorial tf=new TrailingZeroInFactorial();
        tf.trailingZeroInFactorial(100);
    }
}
