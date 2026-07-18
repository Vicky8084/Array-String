package Multithreading;

public class JoinMethod extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Child Thread :- "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        JoinMethod joinMethod = new JoinMethod();
        joinMethod.start();

        try{
            for (int i=0; i<10;i++){
                System.out.println("Main Thread :- "+i);
                Thread.sleep(1000);
                joinMethod.join();
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
