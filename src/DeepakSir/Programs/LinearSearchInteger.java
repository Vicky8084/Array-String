package DeepakSir.Programs;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int []arr={6,4,2,7,3,9,7};
        int target=0,flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found on Index number :- "+i);
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("The element you are finding is not available..");
        }
    }
}
