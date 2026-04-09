package DeepakSir.algorithms.PrefixAndSuffix;
/*\
    in this problem you have given an array of size n and your task is to find the maximum difference between two elements
    like this :- 4,5,2,6,8,2,3 -> example, now let's select element 2 then from 2 check right side of it max difference between each
    element.
 */
public class MaxDifferenceBetweenTwoElement {
    public static void main(String[] args) {
        int[] arr={9,5,8,12,2,3,7,4};
                // 0,1,2, 3,4,5,6,7
        int suffix=arr[arr.length-1],n=arr.length-1,maxSum=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            int currSum=suffix-arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
                System.out.println("max :- "+maxSum+" curr:- "+currSum);
            }
            if(suffix<arr[i]){
                suffix=arr[i];
            }
        }
        System.out.println(maxSum);
        System.out.println(n);
    }
}
