package ArrayPractice;

public class TwoPointer {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,11,13,14,15};
        int target=19,left=0,right=arr.length-1,ans=0;
        while (left<right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==target){
                ans++;
                break;
            }
            if(currentSum>target){
                right--;
            }
            if(currentSum<target){
                left++;
            }
        }
        if(ans!=0){
            System.out.println(arr[left]+" and "+arr[right]);
        }
        else {
            System.out.println("There is no element whose sum is equal to target value");
        }
    }
}
