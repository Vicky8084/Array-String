package OopsProject;

import java.util.ArrayList;

abstract class Employee{
    private int id;
    private String name;
    private int age;
     Employee(int id,String name,int age){
         this.age=age;
         this.name=name;
         this.id=id;
     }
     public int getId(){
         return id;
     }
     public String getName(){
         return name;
     }
     public int getAge(){
         return age;
     }
     abstract double calculateSalary();

    public String toString(){
        return "Employee[ Name :- "+getName()+", age :- "+getAge()+", Id :- "+getId()+", Salary :- "+calculateSalary()+" ]";
    }
}
class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(int id,String name, int age,double salary){
        super(id,name,age);
        this.salary=salary;
    }
    public double calculateSalary(){
        return salary;
    }



}
class PartTimeEmployee extends Employee{
    private int hourlyWorked;
    private double hourlySalary;
    public PartTimeEmployee(int id,String name, int age,int hourlyWorked, double hourlySalary){
        super(id,name,age);
        this.hourlySalary=hourlySalary;
        this.hourlyWorked=hourlyWorked;
    }

    public double calculateSalary(){
        return hourlySalary*hourlyWorked;
    }
}

//ArrayList<Employee> employees=new ArrayList<>();
class PayrollSystem{
    ArrayList<Employee> employees;
    public PayrollSystem(){
        employees=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void showEmployee(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void deleteEmployee(int id){
        Employee employeeToRemove=null;
        for(Employee employee : employees){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employees.remove(employeeToRemove);
        }else{
            System.out.println("Employee is not in the Company");
        }
    }

}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1=new FullTimeEmployee(1,"Vicky",12,67890.98);
        FullTimeEmployee emp2=new FullTimeEmployee(2,"Raushan Kuamr", 34,6789000);
        FullTimeEmployee emp3=new FullTimeEmployee(3,"Sunny",12,67890.98);
        FullTimeEmployee emp4=new FullTimeEmployee(4,"Amit Kuamr", 34,6789000);
        PartTimeEmployee emp5=new PartTimeEmployee(5,"Ankit",34,6,700);
        PartTimeEmployee emp6=new PartTimeEmployee(6,"ankush",56,3,1700);
        PartTimeEmployee emp7=new PartTimeEmployee(7,"anand",24,8,700);
        PartTimeEmployee emp8=new PartTimeEmployee(8,"aman",30,16,300);
        PartTimeEmployee emp9=new PartTimeEmployee(9,"ayush",39,13,900);

        PayrollSystem payrollSystem=new PayrollSystem();

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);
        payrollSystem.addEmployee(emp7);
        payrollSystem.addEmployee(emp8);
        payrollSystem.addEmployee(emp9);
        System.out.println("Before deleted Employee");
        payrollSystem.showEmployee();
        System.out.println("after deleted Employee");
        payrollSystem.deleteEmployee(5);
        payrollSystem.showEmployee();
    }
}
