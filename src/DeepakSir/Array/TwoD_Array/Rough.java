package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Row of a 2-D Matrix :- ");
//        int r=sc.nextInt();
//        System.out.print("Enter Column of a 2-D Matrix :- ");
//        int c=sc.nextInt();
//        int [][]arr=new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print("Enter ["+i+"]th Row and ["+j+"]th Column value :- ");
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("\nRow Wise Matrix is :- ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nColumn Wise Matrix is :- ");
//
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }

//        // Sum of this 2-D Array/Matrix
//
//        int sum=0;
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println("Sum of Elements is :- "+sum);
//
//        //Largest Number in this Matrx
//        int max=arr[0][0];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(max<arr[i][j]){
//                    max=arr[i][j];
//                }
//            }
//        }
//        System.out.println("\nLargest Number is :- "+max);
//
//        //Smallest Number in this Matrx
//        int min=arr[0][0];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(min>arr[i][j]){
//                    min=arr[i][j];
//                }
//            }
//        }
//        System.out.println("\nSmallest Number is :- "+min);
//
//        //Print all Elements from any Specific Row
//        System.out.print("Enter any row number to print its all Elements :- ");
//        int sr= sc.nextInt();
//        if(sr>=0 && sr<=r){
//                for(int j=0;j<c;j++){
//                    System.out.print(arr[j][sr]+" ");
//                }
//        }
//        else System.out.println("\nYou have not Entered Correct Row");
//
//        //Print all Elements from any Specific Column
//        System.out.print("\nEnter any Column number to print its all Elements :- ");
//        int sco= sc.nextInt();
//        if(sco>=0 && sco<=r){
//            for(int j=0;j<c;j++){
//                System.out.print(arr[sco][j]+" ");
//            }
//        }
//        else System.out.println("\nYou have not Entered Correct Row");
//
//        //count All the Elements in the 2-D Array
//        int count=0;
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                count++;
//            }
//        }
//        System.out.println("\nTotal Number of Elements are :- "+count);
//
//        //2D array ka row-wise sum print karo.
//        System.out.println("Sum Row Wise.....");
//        for(int i=0;i<r;i++){
//            int sumRowWise=0;
//            for(int j=0;j<c;j++){
//                sumRowWise+=arr[i][j];
//
//            }
//            System.out.println("Row ["+i+"]th :- "+sumRowWise);
//        }
//
//        //2D array ka Column-wise sum print karo.
//        System.out.println("Sum Column Wise.....");
//        for(int i=0;i<r;i++){
//            int sumColumnWise=0;
//            for(int j=0;j<c;j++){
//                sumColumnWise+=arr[j][i];
//
//            }
//            System.out.println("Row ["+i+"]th :- "+sumColumnWise);
//        }
//
//        //2D array ka diagonal sum nikalo.
//        int digonalSum=0;
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(i==j){
//                    digonalSum+=arr[i][j];
//                }
//            }
//        }
//        System.out.println("Diagonal Sum :- "+digonalSum);

        //Check karo matrix identity matrix hai ya nahi.
//        if(r!=c){
//            System.out.println("Given Matrix is not identity Matrix");
//            return;
//        }
//
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(i==j){
//                    if(arr[i][j]!=1){
//                        System.out.println("Given Matrix is not identity Matrix");
//                        return;
//                    }
//                } else {
//                    if(arr[i][j]!=0){
//                        System.out.println("Given Matrix is not identity Matrix");
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("Given Matrix is identity Matrix");

//        Scanner sc=new Scanner(System.in);
//        //System.out.println("Enter Details For First Matrix.........");
//        System.out.print("Enter Row of a 2-D Matrix :- ");
//        int r1=sc.nextInt();
//        System.out.print("Enter Column of a 2-D Matrix :- ");
//        int c1=sc.nextInt();
//        int [][]arr1=new int[r1][c1];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                System.out.print("Enter ["+i+"]th Row and ["+j+"]th Column value :- ");
//                arr1[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("\nEnter Details For Second Matrix.........");
//        System.out.print("Enter Row of a 2-D Matrix :- ");
//        int r2=sc.nextInt();
//        System.out.print("Enter Column of a 2-D Matrix :- ");
//        int c2=sc.nextInt();
//        int [][]arr2=new int[r2][c2];
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                System.out.print("Enter ["+i+"]th Row and ["+j+"]th Column value :- ");
//                arr2[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("\nMatrix is :- ");
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("\nSecond Matrix is :- ");
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int[][]sum=new int[r1][c1];
//        if(r2==c2 && c2==c1 ){ //matrix ka row column equal or dono matrix mtlb matrix 1 ka
//            for(int i=0;i<r1;i++){
//                for(int j=0;j<c1;j++){
//                    sum[i][j]=arr1[i][j]+arr2[i][j];
//                }
//            }
//        }
//        else{
//            System.out.println("Row Matrx Condition is not satisfied");
//        }
//        System.out.println("\nSum of Both Matrix is :- ");
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        //Do 2D arrays ko subtract karo.

//        int[][]sub=new int[r1][c1];
//        if(r2==c2 && c2==c1 ){ //matrix ka row column equal or dono matrix mtlb matrix 1 ka
//            for(int i=0;i<r1;i++){
//                for(int j=0;j<c1;j++){
//                    sub[i][j]=arr1[i][j]-arr2[i][j];
//                }
//            }
//        }
//        else{
//            System.out.println("Row Matrx Condition is not satisfied");
//        }
//        System.out.println("\nSubtract of Both Matrix is :- ");
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                System.out.print(sub[i][j]+" ");
//            }
//            System.out.println();
//        }


        //Matrix ka upper triangle print karo.
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                if(i>j){
//                    if(arr1[i][j]!=0){
//                        System.out.println("Given Matrix is not Upper Triangle Matrix");
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("Given Matrix is Upper Triangle Matrix");



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details For First Matrix.........");
        System.out.print("Enter Row of a 2-D Matrix :- ");
        int r1=sc.nextInt();
        System.out.print("Enter Column of a 2-D Matrix :- ");
        int c1=sc.nextInt();
        int [][]arr1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print("Enter ["+i+"]th Row and ["+j+"]th Column value :- ");
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nEnter Details For Second Matrix.........");
        System.out.print("Enter Row of a 2-D Matrix :- ");
        int r2=sc.nextInt();
        System.out.print("Enter Column of a 2-D Matrix :- ");
        int c2=sc.nextInt();
        int [][]arr2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print("Enter ["+i+"]th Row and ["+j+"]th Column value :- ");
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nFirst Matrix is :- ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nSecond Matrix is :- ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        /*
        Condition for Matrix Multiplication
        1. the column of first Matrix is equal to row of second Matrix
        2. the result matrix size is the row of first matrix and column of Second Matrix should be equal
         */
        int [][]result=new int[r1][c2];
        if(r1==c1 && r2==c2 && r1==r2){

        }
        else{
            System.out.println("Both matrix should be same size and Square Matrix");
        }
    }
}
