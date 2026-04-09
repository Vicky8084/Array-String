package PracticeQuestions.Sorting;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-4);
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

        for(int i=0;i<list.size()-1;i++){
            int min=i;
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)< list.get(min)){
                    min=j;
                }
            }
            int temp=list.get(i);
            list.set(i, list.get(min));
            list.set(min,temp);
        }

        System.out.print("\nList After Sorted :- ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
