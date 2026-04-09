package Algorithms.prefix;


import java.util.Scanner;

public class prefixSumGfg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Array :- ");
        int n=sc.nextInt();
        int []arr =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are in the Array :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        int sum=0,result=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }



        //Including all the elements
//        int sum=0,result=0;
//        for(int i=0;i<n;i++){
//            sum+=arr[i];
//        }
//        for(int i=0;i<n;i++){
//            result+=arr[i];
//            if((sum-result)==result){
//                System.out.println("yes");
//                return;
//            }
//        }


        //Rough work
//        int sum1=0,sum2=0;
//        for(int i=0;i<n;i++) {
//            sum1=0;
//            sum2=0;
//            for (int j = 0; j <= i; j++) {
//                sum1 += arr[j];
//            }
//            for (int j = i + 1; j < n; j++) {
//                sum2 += arr[j];
//            }
//            if(sum1==sum2){
//                System.out.println("\nIndex is :- "+i);
//                return;
//            }
//        }
    }
}
