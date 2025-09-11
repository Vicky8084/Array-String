package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementOfArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        list.add("Vicky Gupta");
        list.add("Sunny Gupta");
        list.add("Rajesh Gupta");
        list.add("Neha Gupta");
        list.add("Kritika Gupta");
        list.add("Ansh Gupta");
        list.add("Ayush Gupta");
        System.out.print("elements are in the list :- ");
        for(String key:list){
            System.out.print(key+", ");
        }
        System.out.println("\nLast element is :- "+list.get(list.size()-1));
        System.out.println("First element is :- "+list.get(0));
    }
}
