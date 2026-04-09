package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter limit of of list :- ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
            sum+=list.get(i);
        }
        System.out.println("Sum of Elements is :- "+sum);

    }
}