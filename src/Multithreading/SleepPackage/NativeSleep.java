package Multithreading.SleepPackage;

public class NativeSleep {
//    public static void main(String[] args) throws InterruptedException {
//        for(int i=0;i<10;i++){
//            Thread.sleep(1000);
//            System.out.print(i+" ");
//        }
//    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
