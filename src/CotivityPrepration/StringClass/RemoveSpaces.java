package CotivityPrepration.StringClass;
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to remove all the spaces :- ");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=' '){
                stringBuilder.append(string.charAt(i));
            }
        }
        System.out.println(string);
        System.out.println(stringBuilder);
    }
}
