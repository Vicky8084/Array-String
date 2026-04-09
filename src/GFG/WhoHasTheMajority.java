package GFG;
import java.util.*;
class WhoHasTheMajority {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(39);
        arr.add(36);
        arr.add(21);
        arr.add(21);
        arr.add(9);
        arr.add(24);
        arr.add(20);
        int x=35,y=2;
        int countX=0,countY=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==x){
                countX++;
            }
            else if(arr.get(i)==y){
                countY++;
            }
        }
        if(countX>countY) System.out.print(countX);
        else if(countX==countY){
            if(x>y) System.out.print(y);
            else System.out.print(x);;
        }
        else System.out.print(countY);
    }
}
