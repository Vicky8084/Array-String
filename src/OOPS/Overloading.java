package OOPS;

public class Overloading {
    public void overloading(){
        System.out.println("0 Argument...!!");
    }
    public void overloading(int a){
        System.out.println("Value of a is :- "+a);
    }
    public void overloading(int a, int b){
        System.out.println("Value of a and b is :- "+a+" "+b);
    }
    public void overloading(String name,int age){
        System.out.println("Value of name and age is :- "+name+" "+age);
    }
    public void overloading(int b,int c,int d){
        System.out.println("Value of b, c and d is :- "+b+" "+c+" "+d);
    }
    public void overloading(int age,String name){
        System.out.println("Value of name and age is :- "+name+" "+age);
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.overloading();
        overloading.overloading(12);
        overloading.overloading(3,4);
        overloading.overloading("vicky",43);
        overloading.overloading(2,3,4);
        overloading.overloading(34,"sunny");
    }
}
