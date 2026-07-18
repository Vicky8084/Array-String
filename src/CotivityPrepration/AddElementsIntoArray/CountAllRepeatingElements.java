package CotivityPrepration.AddElementsIntoArray;

public class CountAllRepeatingElements {
    public static void main(String[] args) {
        int[] arr={4,3,2,9,7,2,7,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int count=1;
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k-1];
                    }
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i]+" :- "+count);
        }
    }
}
