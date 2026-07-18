package TwoPointers;

public class PrintPainSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=6,left=0,right=arr.length-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(left+" "+right);
                left++;
                right--;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
    }
}
