package BinarySearch;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Element which is in Ascending Order :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //3 4 9 10 12 18 19
        System.out.print("\nEnter Element which you want to search :- ");
        int target=sc.nextInt();
        int si=0,ei=n-1,ans=-1;
        while (si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            if(arr[mid]>target){
                ei=mid-1;
            }
            if(arr[mid]<target){
                si=mid+1;
            }
        }
        if(ans==-1){
            System.out.println(target+" is not available in this array ....!!!");
        }
        else{
            System.out.println(target+" is available in this array ....!!!");
        }
    }
}
