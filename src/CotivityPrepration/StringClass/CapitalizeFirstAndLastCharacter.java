package CotivityPrepration.StringClass;
public class CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        String string = "vicky Gupta";
        String newString = convertCharacterToStringWithUpperCase(string.charAt(0))
                +string.substring(1,string.length()-1)
                +convertCharacterToStringWithUpperCase(string.charAt(string.length()-1));
        System.out.println(newString);
    }
    public static String convertCharacterToStringWithUpperCase(char ch){
        return String.valueOf(Character.toUpperCase(ch));
    }
}
