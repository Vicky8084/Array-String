package OOPS;

public class Constructors {
    String name;
    int age;
    Constructors(){
        System.out.println("This is default Constructor..!");
    }
    Constructors(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        Constructors constructors=new Constructors("Vicky Gupta",24);
        Constructors constructor=new Constructors();
        constructors.display();
    }
}
