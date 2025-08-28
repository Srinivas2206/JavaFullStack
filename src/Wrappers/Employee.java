package Wrappers;

public class Employee implements Cloneable {
    String empName;
    int empId;
    int Salary;

    Employee() {

    }

    Employee(String name, int id, int salary) {
        this.empName = name;
        this.empId = id;
        this.Salary = salary;
    }

    public void getDetails() {
        System.out.println("Employee name: " + this.empName);
        System.out.println("Employee id: " + this.empId);
        System.out.println("Employee Salary: " + this.Salary);
    }

    public void setDetails(String name, int id, int salary) {
        this.empName = name;
        this.empId = id;
        this.Salary = salary;
    }

    Employee cloneEmployee() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return this;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empName = "ViratKohli";
        emp.Salary = 100000;
        emp.empId = 101;

        Employee emp2;
        emp2 = emp.cloneEmployee();

        emp.getDetails();
        emp2.getDetails();

        emp.setDetails("ABD", 102, 200000);
        emp.getDetails();
        emp2.getDetails();

    }
}
