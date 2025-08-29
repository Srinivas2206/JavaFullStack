/*
 * Create a class called Employee with properties 
 * name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).
 * 
 * Create respective getter and setter methods and constructors 
 * (no-argument constructor and parameterized constructor) for the same.
 * 
 * Create an object of the Employee class and save this object in a file called "data" using serialization.
 * Later using deserialization read this object and print the properties of this object.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // constructors
    public Employee() {

    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getSalary() {
        return this.salary;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dobStr = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";
        return "Name: " + this.name + ", Date Of Birth: " + dobStr + ", Department: "
                + this.department + ", Designation: " + this.designation + ", Salary: " + this.salary;
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JANUARY, 1);
        Date dob = cal.getTime();
        Employee emp = new Employee("ViratKohli", dob, "R&D", "Engineer", 100000.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(emp);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Employee obj = (Employee) ois.readObject();
            System.out.println("Deserialised Object: ");
            System.out.println(obj.toString());
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
