package ShashCode.NumberConversionSystem;

public class HexaToDecimal {
    private int getDigit(char ch){
        return switch (ch) {
            case 'A' -> 10;
            case 'a' -> 10;
            case 'B' -> 11;
            case 'b' -> 11;
            case 'C' -> 12;
            case 'c' -> 12;
            case 'D' -> 13;
            case 'd' -> 13;
            case 'E' -> 14;
            case 'e' -> 14;
            case 'F' -> 10;
            case 'f' -> 10;
            default -> ch - '0';
        };
    }
    public void hexaToDecimal(String num){
        int pos=0,result=0;
        for(int i=num.length()-1;i>=0;i--){
            int val=getDigit(num.charAt(i));
            result=result+val*(int)Math.pow(16,pos);
            pos++;
        }
        System.out.println("Decimal Value is :- "+result);
    }
    public static void main(String[] args) {
        HexaToDecimal hx=new HexaToDecimal();
        hx.hexaToDecimal("6b");
    }
}
