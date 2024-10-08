
class Employee {

    private final int employeeID;
    private double salary = 30000;
    private static String Companyname;

    Employee(int employeeID, double salary) {
        this.employeeID = employeeID;
        this.salary = 30000;

    }

    void displaySalary() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID:" + employeeID);
        System.out.println("Company Name:" + Companyname);
        System.out.println("Salary:" + salary);

    }

    static void setCompany(String name) {
        Companyname = name;

    }

}
