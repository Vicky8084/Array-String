package DeepakSir.Programs;

public class BinarySearchInteger {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};

        int leftIndex=0,rightIndex=arr.length-1,target=2;
        while (leftIndex<=rightIndex){
            int mid=(leftIndex+rightIndex)/2;
            if(arr[mid]==target){
                System.out.println("Element found on Index number :- "+mid);
                break;
            } else if (arr[mid]<target) {
                leftIndex=mid+1;
            }
            else{
                rightIndex=mid-1;
            }
        }
    }
}
