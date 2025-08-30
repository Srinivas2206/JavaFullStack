package JavaCollections.list;

import java.util.ArrayList;

/*
 *
 * 1) Create an application for employee management with the following classes: 
 * 
 * a) Create an Employee class with following attributes and behaviors :
 * i) int empId
 * ii)String empName
 * iii)String email
 * iv)String gender 
 * v)float salary
 * vi) void GetEmployeeDetails() -> prints employee details
 * 
 * b) Create one more class EmployeeDB with the following attributes and behaviors.
 * (i)ArrayList list;
 * ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
 * iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
 * iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
 * 
 * Provide implementation for all the methods and test your program. 
 * 
 * 
*/

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

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    EmployeeDB() {

    }

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return list.remove(e);
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Amount paid to " + e.empName + " is " + e.salary;
            }
        }
        return "No Employee found";
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee emp1 = new Employee(01, "VK", "vk.com", "Male", 100000);
        Employee emp2 = new Employee(02, "SK", "sk.com", "Male", 150000);

        EmployeeDB employeeDB = new EmployeeDB();

        employeeDB.addEmployee(emp1);
        employeeDB.addEmployee(emp2);

        for (Employee e : employeeDB.list) {
            e.getEmployeeDetails();
        }

        employeeDB.deleteEmployee(01);

        for (Employee e : employeeDB.list) {
            e.getEmployeeDetails();
        }

        System.out.println(employeeDB.showPaySlip(02));
    }

}
