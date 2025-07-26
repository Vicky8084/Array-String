package HashMapPackage;
import java.util.HashMap;
import java.util.Scanner;
public class ArrayToHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println("\nMap is :- ");
        for(Integer key : map.keySet()){
            System.out.println(key+" :- "+map.get(key));
        }
    }
}
