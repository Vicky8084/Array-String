package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class CubeWithoutUsingAsterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n=scanner.nextInt();
        System.out.println("Cube is without '*' :- "+cube(n));
    }
    public static int square(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result = result+n;
        }
        return  result;
    }
    public static long cube(int n){
        long result = 0;
        int sq = square(n);
        for(int i=1;i<=n;i++){
            result+=sq;
        }
        return result;
    }
}

/*
      --   2 -> 2*2*2 => 8  -> (2+2) + (2+2) . => 8
      --   3 -> 3*3*3 => 27 -> (3+3+3) + (3+3+3) + (3+3+3) => 27
      --   4 -> 4*4*4 => 64 -> (4+4+4+4) + (4+4+4+4) + (4+4+4+4) + (4+4+4+4) => 64
 */
