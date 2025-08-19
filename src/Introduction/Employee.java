public class Employee extends Person {
    double annualSalary;
    int year;
    String num;

    Employee(String name, double annualSalary, int year, String num) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.year = year;
        this.num = num;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYear() {
        return year;
    }

    public String getNum() {
        return num;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNum(String num) {
        this.num = num;
    }

}
