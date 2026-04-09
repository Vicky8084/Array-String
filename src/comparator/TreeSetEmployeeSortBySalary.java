package comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "Id :- "+id
                +", Name :- "+name
                +", Salary :- "+salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class TreeSetEmployeeSortBySalary {
    public static void main(String[] args) {
        Comparator<Employee> employeeComparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()< o2.getSalary()){
                    return 1;
                }
                else if(o1.getSalary()==o2.getSalary()){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        };

        TreeSet<Employee> employeeTreeSet=new TreeSet<>(employeeComparator);
        employeeTreeSet.add(new Employee(12,"Vicky Gupta",67000));
        employeeTreeSet.add(new Employee(13,"Sunny Gupta",56000));
        employeeTreeSet.add(new Employee(14,"Aman Gupta",34000));
        employeeTreeSet.add(new Employee(15,"Prity Gupta",51000));
        employeeTreeSet.add(new Employee(16,"Khushi Gupta",77000));
        employeeTreeSet.add(new Employee(17,"Kritika Gupta",16000));
        employeeTreeSet.add(new Employee(18,"Ansh Gupta",67900));
        employeeTreeSet.add(new Employee(19,"Ayush Gupta",52000));
        employeeTreeSet.forEach(System.out::println);
    }
}
