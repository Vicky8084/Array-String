package Strings;
import java.util.Scanner;


public class StrongPasswordChecker {
    // List of common domain keywords to check against in password
//    private static String[] COMMON_DOMAINS = {
//            "gmail", "yahoo", "hotmail", "facebook", "google", "amazon", "twitter", "linkedin"
//    };
//
//    public static boolean containsDomain(String password) {
//        String lowerPass = password.toLowerCase();
//        for (String domain : COMMON_DOMAINS) {
//            if (lowerPass.contains(domain)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isStrongPassword(String password) {
//        if (password.length() < 8) {
//            return false; // too short
//        }
//        if (containsDomain(password)) {
//            return false; // contains a domain, considered weak
//        }
//
//        boolean hasUpper = false;
//        boolean hasLower = false;
//        boolean hasDigit = false;
//        boolean hasSpecial = false;
//
//        for (int i = 0; i < password.length(); i++) {
//            char ch = password.charAt(i);
//            if (Character.isUpperCase(ch)) hasUpper = true;
//            else if (Character.isLowerCase(ch)) hasLower = true;
//            else if (Character.isDigit(ch)) hasDigit = true;
//            else if ("!@#$%^&*()-+=<>?/{}~|".indexOf(ch) >= 0) hasSpecial = true;
//        }
//
//        return hasUpper && hasLower && hasDigit && hasSpecial;
//    }

    private static final String[] COMMON_DOMAINS={"gmail", "yahoo", "hotmail", "facebook", "google", "amazon", "twitter", "linkedin"};
    public static Boolean containsDomain(String password){
        for(String domain:COMMON_DOMAINS){
            String lowerPass=password.toLowerCase();
            if(lowerPass.contains(domain)){
                return true;
            }
        }
        return false;
    }

    public static boolean isStrongPassword(String password){
        if(password.length()<8){
            return false;
        }
        if(containsDomain(password)){
            return false;
        }

        boolean hasDigit=false, hasSpecial=false, hasUpper=false, hasLower=false;

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isDigit(ch)) hasDigit=true;
            else if (Character.isUpperCase(ch)) hasUpper=true;
            else if("!@#$%^&*~`<,>.?/|}{".indexOf(ch)>=0) hasSpecial=true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password to check: ");
        String password = sc.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("This is a strong password!");
        } else {
            System.out.println("This is NOT a strong password.");
        }
    }
}
