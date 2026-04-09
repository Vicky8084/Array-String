package DeepakSir.Programs;

public class TwiceRepeatedElement {
    public static void main(String[] args) {
        int []arr={5,6,4,5,6,3,4};
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
