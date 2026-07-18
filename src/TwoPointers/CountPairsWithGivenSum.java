package TwoPointers;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=6,count=0,left=0,right=arr.length-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                left++;
                right--;
            } else if (sum>target) {
                right--;
            }else{
                left++;
            }
        }
        System.out.println("Pair of Sum in Given Array with "+target+" target is :- "+count);
    }
}
