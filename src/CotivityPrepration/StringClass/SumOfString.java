package CotivityPrepration.StringClass;

public class SumOfString {
    public static void main(String[] args) {
        String str = "abc123bffe5df453f";
        int sum = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                //sum+=ch - '0';
                sum+=Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
