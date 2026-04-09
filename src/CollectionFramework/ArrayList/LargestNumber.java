package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-43);
        list.add(-22);
        list.add(-88);
        list.add(-131);
        list.add(-15);
        list.add(-45);
        list.add(-31);
        list.add(-22);
        if(list.size()>0){
            int max=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i)>list.get(max)){
                    max=i;
                }
            }
            System.out.println("Largest Number in the List is :- "+list.get(max));
        }
        else System.out.println("List is Empty");
    }
}
