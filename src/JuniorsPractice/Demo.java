package JuniorsPractice;
import java.util.*;

public class Demo {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of an Array :- ");
        int n=sc.nextInt();
        int []arr=new int[90];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/*
    Syntax
    formatSpecifier class ClassName{

    }

    //int, char, float, boolean, double, sort, long, byte

    formatSpecifier
    1. public
    2. private
    3. protected
    4. default

    camalCase->

 */
