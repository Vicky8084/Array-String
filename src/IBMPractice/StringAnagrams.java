package IBMPractice;

import java.util.HashMap;
import java.util.Scanner;

public class StringAnagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String :- ");
        String str1=sc.nextLine();
        System.out.print("Enter Second String :- ");
        String str2=sc.nextLine();
        int n1=str2.length();
        int n2=str1.length();
        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");
        if(n1==n2){
            HashMap<Character, Integer> map1=new HashMap<>();
            for(int i=0;i<n1;i++){
                if(!map1.containsKey(str1.charAt(i))){
                    map1.put(str1.charAt(i),1);
                }
                else{
                    map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
                }
            }

            HashMap<Character, Integer> map2=new HashMap<>();
            for(int i=0;i<n2;i++){
                if(!map2.containsKey(str2.charAt(i))){
                    map2.put(str2.charAt(i),1);
                }
                else{
                    map2.put(str2.charAt(i),map2.get(str2.charAt(i))+1);
                }
            }
            if(map1.equals(map2)){
                System.out.println("Both Strings are anagrams");
            }
            else{
                System.out.println("Both Strings are not anagrams");
            }

        }
        else{
            System.out.println("Both Strings are not anagrams");
        }
    }
}