package CotivityPrepration.StringClass;

import java.util.Scanner;

public class RemoveCharacterExceptAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to remove all the Character except Alphabets :- ");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            if(Character.isAlphabetic(ch)){
                stringBuilder.append(ch);
            }
        }
        System.out.println(string);
        System.out.println(stringBuilder);
    }
}
