package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementBetweenTwoArrays {
    public static ArrayList<Integer> commonElementBetweenTwoArrays(int []arr1, int[] arr2){
        int n1=arr1.length,n2=arr2.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Note :- size of both array should be same\nEnter First Array Details :- \n");
        System.out.print("Enter Limit of array :- ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter Second Array Details :- \n");
        System.out.print("Enter Limit of array :- ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> list=commonElementBetweenTwoArrays(arr1,arr2);
        System.out.println("Common Elements are :- ");
        for(Integer key:list){
            System.out.print(key+" ");
        }
    }
}
