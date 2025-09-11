package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class FindMaximumOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Any String :- ");
//        String str=sc.nextLine();
//        int[] arr=new int[255];
//        for(int i=0;i<str.length();i++){
//            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
//        }
//        int max=-1;
//        char ch=' ';
//        for(int i=0;i<str.length();i++){
//            if(max<arr[str.charAt(i)]){
//                max=arr[str.charAt(i)];
//                ch=str.charAt(i);
//            }
//        }
//        System.out.println("Maximum Occurring Character is :- "+ch);

        System.out.print("Enter Any String :- ");
        String str1=sc.nextLine();
        str1=str1.replaceAll("\\s","");
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),1);
            }
            else {
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }
        }
        for(Character key:map.keySet()){
            System.out.println(key+" :- "+map.get(key));
        }
    }
}
