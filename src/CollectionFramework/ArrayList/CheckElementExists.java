package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementExists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        System.out.print("Enter any number to is this exists or not :- ");
        int dgt=sc.nextInt();
        for(int i=0;i<list.size();i++){
            if(dgt==list.get(i)){
                System.out.println(dgt+" is Existing in this list");
                return;
            }
        }
        System.out.println(dgt+" is not Existing in this list");
    }
}
