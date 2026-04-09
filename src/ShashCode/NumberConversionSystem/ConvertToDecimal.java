package ShashCode.NumberConversionSystem;

public class ConvertToDecimal {
    public int getDigit(char ch){
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
            case 'F' -> 15;
            case 'f' -> 15;
            default -> ch - '0';
        };
    }
    public void convertToDecimal(String num, int currBase){
        int pos=0, result=0;
        for(int i=num.length()-1;i>=0;i--){
            if(getDigit(num.charAt(i))>=currBase){
                System.out.println("invalid Conversion");
                return;
            }
            int val=getDigit(num.charAt(i));
            result = result+val*(int)Math.pow(currBase,pos);
            pos++;
        }
        System.out.println("Decimal Value is :- "+result);
    }
    public static void main(String[] args) {
        ConvertToDecimal cd=new ConvertToDecimal();
        cd.convertToDecimal("4567",8);
    }
}
