import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee [Name :- "+name+", id :- "+id+", salary :- "+calculateSalary()+" ]";
    }

}
class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(String name, int id, double salary){
        super(name,id);
        this.salary=salary;
    }
    @Override
    public double calculateSalary(){
        return salary;
    }

}
class PartTimeEmployee extends Employee{
    private int hourlyWorked;
    private double hourlySalary;
    public PartTimeEmployee(String name, int id, int hourlyWorked, double hourlySalary){
        super(name,id);
        this.hourlySalary=hourlySalary;
        this.hourlyWorked=hourlyWorked;
    }
    public double calculateSalary(){
        return hourlySalary*hourlyWorked;
    }
}
class PayrollSystem{
    private ArrayList<Employee> employeeList;
    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for(Employee employee : employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}


public class EmployeePayrollSystem {
    public static void main(String[] args) {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTimeEmployee emp1=new FullTimeEmployee("Vicky Gupta", 1, 70000.00);
        FullTimeEmployee emp2=new FullTimeEmployee("Sunny Gupta", 2,75000.00);
        PartTimeEmployee emp3=new PartTimeEmployee("Amit Kumar", 3,5,560);
        PartTimeEmployee emp4=new PartTimeEmployee("Rohan Gupta",4,8,950);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.displayEmployee();
        payrollSystem.removeEmployee(3);
        payrollSystem.displayEmployee();
    }
}
