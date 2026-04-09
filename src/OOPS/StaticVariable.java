package OOPS;
class Employee{
    int empId;
    String name;
    static String company="Cotiviti";
    Employee(int empId,String name){
        this.name=name;
        this.empId=empId;
    }
    public void show(){
        System.out.println("Employee name :- "+name+" id :- "+" Company :- "+company);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Vicky Gupta");
        emp1.show();
        Employee emp2=new Employee(102,"Sunny Gupta");
        emp2.show();
        Employee emp3=new Employee(103,"Ansh Gupta");
        emp3.show();
        Employee emp4=new Employee(104,"Ayush Gupta");
        emp4.show();
    }
}
