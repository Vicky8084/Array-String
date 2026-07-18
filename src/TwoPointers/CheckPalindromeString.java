package TwoPointers;
public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "vicv";
        boolean isPalindrome=true;
//        for(int i=0;i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                isPalindrome=false;
//                break;
//            }
//        }
        int left=0, right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }
}
