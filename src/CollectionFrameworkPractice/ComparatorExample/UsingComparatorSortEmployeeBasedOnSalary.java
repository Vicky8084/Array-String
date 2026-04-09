package CollectionFrameworkPractice.ComparatorExample;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Employee{
    private int id;
    private String name;
    private double salary;
    Employee(int id, String name, double salary){
        this.salary=salary;
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class UsingComparatorSortEmployeeBasedOnSalary {
    public static void main(String[] args) {
        Comparator<Employee> comparator = (emp1, emp2) -> {
            return emp1.getSalary() < emp2.getSalary() ? 1 : Objects.equals(emp1.getSalary(),emp2.getSalary()) ? 0 : -1 ;
        };
        TreeSet<Employee> ts=new TreeSet<>(comparator);
        ts.add(new Employee(101,"Vicky Gupta",50000.34));
        ts.add(new Employee(102,"Sunny Gupta",45000.34));
        ts.add(new Employee(103,"Aman Gupta",90444.90));
        ts.add(new Employee(104,"Ansh Gupta",50234.34));
       for(Employee key : ts){
           System.out.println(key);
       }
    }
}