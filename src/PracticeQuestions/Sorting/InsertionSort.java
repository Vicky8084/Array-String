package PracticeQuestions.Sorting;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);


        System.out.print("List Before Sorted :- ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        for(int i=1;i<list.size();i++){
            int temp=list.get(i),j=i;
            while(j>0 && list.get(j-1)>temp){
                list.set(j,list.get(j-1));
                j--;
            }
            list.set(j,temp);
        }

        System.out.print("\nList After Sorted :- ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
