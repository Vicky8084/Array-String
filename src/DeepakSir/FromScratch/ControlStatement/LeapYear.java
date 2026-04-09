package DeepakSir.FromScratch.ControlStatement;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Year to Check Leap Year or Not :- ");
        int year=sc.nextInt();
//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println("Given Year "+year+" is Leap Year");
//                }
//                else System.out.println("Given Year "+year+" is not Leap Year");
//            }
//            else System.out.println("Given Year "+year+" is Leap Year");
//
//        }
//        else System.out.println("Given Year "+year+" is not Leap Year");

        if((year%400==0) ||(year%4==0 && year%100!=0)){
             System.out.println("Given Year "+year+" is Leap Year");
        }
        else System.out.println("Given Year "+year+" is not Leap Year");
    }
}
