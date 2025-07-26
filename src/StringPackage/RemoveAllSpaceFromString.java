package StringPackage;

public class RemoveAllSpaceFromString {
    public static void main(String[] args) {
        String str1="My Name is Vicky Gupta";
        String str2="";
//        for(int i=0;i<str1.length();i++){
//            if(Character.isLetterOrDigit(str1.charAt(i))){
//                str2+=str1.charAt(i);
//            }
//        }
//        System.out.println(str2);
        for(int i=0;i<str1.length();i++){
            if(!Character.isWhitespace(str1.charAt(i))){
                str2+=str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
