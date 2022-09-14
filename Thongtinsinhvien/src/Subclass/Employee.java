package Subclass;

public class Employee {
    public String empName;

    public Employee() {
    }

    public Employee(String empName) {
        this.empName = empName;
    }
    void displayDetails(){
        System.out.printf("Employee Name: %s", empName);
    }
}
