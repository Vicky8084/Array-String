package DeepakSir.Programs;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] arr={"Vicky","Sunny","Amit","Aman","Anuj"};
        int n=arr.length,flag=0;
        String target="Aman";
        for(int i=0;i<n;i++){
            if(arr[i].equals(target)){
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
