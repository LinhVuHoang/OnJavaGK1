package Subclass;

public class SalaryEmployee extends Employee {
    public double salary;
    public SalaryEmployee() {
    }

    public SalaryEmployee(String empName) {
        super(empName);
    }
    public  SalaryEmployee(String name,double currentSalary){
        super(name);
        salary = currentSalary;
    }
    public void displayDetails(){
        super.displayDetails(); // gọi đến cha mà class extends(kế thừa)
        System.out.printf("\n" + empName + "'s Salary: %.2f\n", salary);

    }
}
