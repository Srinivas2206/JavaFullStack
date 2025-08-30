package JavaCollections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee() {

    }

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {
        System.out.println("Id: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }
}

public class Sample4 {
    public static void main(String[] args) {
        Vector<Employee> employeeList = new Vector<>();
        Employee emp1 = new Employee(01, "VK", "vk.com", "Male", 100000);
        Employee emp2 = new Employee(02, "SK", "sk.com", "Male", 150000);

        employeeList.add(emp1);
        employeeList.add(emp2);

        System.out.println("Using Iterator: ");
        Iterator<Employee> it = employeeList.iterator();

        while (it.hasNext()) {
            it.next().getEmployeeDetails();
        }

        System.out.println("\nUsing enumeration: ");
        Enumeration<Employee> emp;
        emp = employeeList.elements();

        while (emp.hasMoreElements()) {
            emp.nextElement().getEmployeeDetails();
        }
    }
}
