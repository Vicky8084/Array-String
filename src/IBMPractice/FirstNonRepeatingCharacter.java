package IBMPractice;


public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aaabbcd";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {  // check against all characters
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                    break; // no need to check further
                }
            }
            if (count == 0) {
                System.out.println("The first non-repeating character is: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
