public class TestEmployee {
    // Create a class called Person with a member variable name. Save it in a file
    // called Person.java

    // Create a class called Employee that will inherit the Person class.The other
    // data members of the Employee class are annual salary (double), the year the
    // employee started to work, and the national insurance number which is a
    // String.Save this in a file called Employee.java

    // Your class should have the necessary constructors and getter/setter methods.

    // Write another class called TestEmployee, containing a main method to fully
    // test your class definition.

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 50000, 2020, "AB123456C");

        // Test getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYear());
        System.out.println("National Insurance Number: " + emp.getNum());
        // Test setters
        emp.setName("Jane Doe");
        emp.setAnnualSalary(60000);

        emp.setYear(2021);
        emp.setNum("CD789012E");
        // Print updated values
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Updated Year Started: " + emp.getYear());
        System.out.println("Updated National Insurance Number: " + emp.getNum());
    }
}
