package Algorithms.TwoPointer;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={3,5,3};
        int target=6;

        //--------Brute Force Algorithm ---------------
        int result=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                result=arr[i]+arr[j];
                if(result==target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
