package TwoPointers;

public class ValidPalindrome {
//    public static void main(String[] args) {
//        String str= "A man, a plan, a canal: Panama";
//        StringBuffer sb = new StringBuffer();
//        boolean isPalindrome=true;
//        for(int i=0;i<str.length();i++){
//            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
//                sb.append(Character.toLowerCase(str.charAt(i)));
//            }
//        }
//        for(int i=0;i<sb.length()/2;i++){
//            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
//                isPalindrome=false;
//                break;
//            }
//        }
//        if(isPalindrome){
//            System.out.println("Given String is Palindrome");
//        }else{
//            System.out.println("Given String is not Palindrome");
//        }
//    }

    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        boolean isPalindrome=false;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(Character.isLetterOrDigit(ch) || str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                isPalindrome=true;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }
}
