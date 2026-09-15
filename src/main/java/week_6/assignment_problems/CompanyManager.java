class Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyManager {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = new Employee("Bhavna", 60000);
        Employee e3 = new Employee("Chetan", 55000);

        Employee.printCompanyInfo();
    }
}
