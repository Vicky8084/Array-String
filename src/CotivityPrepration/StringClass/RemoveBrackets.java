package CotivityPrepration.StringClass;

public class RemoveBrackets {
    public static void main(String[] args) {
        String str = "{x+[y*(z+1)]}";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '(' && ch != ')' && ch != '[' && ch != ']' && ch != '{' && ch != '}') {
                sb.append(ch);
            }
        }
        System.out.println(str);
        System.out.println(sb);
        String string = str.replaceAll("[(){}\\[\\]]","");
        System.out.println(string);
    }
}
