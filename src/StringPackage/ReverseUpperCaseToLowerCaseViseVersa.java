package StringPackage;

public class ReverseUpperCaseToLowerCaseViseVersa{
    public static void main(String[] args) {
        String str1="VIcky Gupta45%@#$";
        String str2="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(Character.isUpperCase(ch)){
                str2+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                str2+=Character.toUpperCase(ch);
            }
            else{
                str2+=ch;
            }
        }
        System.out.println(str2);
    }
}
