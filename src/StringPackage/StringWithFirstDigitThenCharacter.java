package StringPackage;

public class StringWithFirstDigitThenCharacter {
    public static void main(String[] args) {
        String str1="Vicky&@ Gupta123&";
        int n=str1.length();
//        String str2="";
//        for(int i=0;i<n;i++){
//            if(Character.isDigit(str1.charAt(i))){
//                str2+=str1.charAt(i);
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(!Character.isDigit(str1.charAt(i))){
//                str2+=str1.charAt(i);
//            }
//        }
//        System.out.println(str2);

        String s="",r="";
        for(int i=0;i<n;i++){
            if(Character.isDigit(str1.charAt(i))){
                s+=str1.charAt(i);
            }
            else{
                r+=str1.charAt(i);
            }
        }
        System.out.println(s+r);
    }
}
