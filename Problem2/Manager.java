
class Manager extends Employe {
    final int bonus = 5000;

    Manager(int employeeID, double salary) {
        super(employeeID, salary);

    }

    void displaySalary() {
        double Totalsalary = bonus + salary;

        System.out.println("Manager details:");
        System.out.println("Company Name :" + Companyname);
        System.out.println("Employee ID :" + employeeID);
        System.out.println("Salary with bonus :" + Totalsalary);

    }

}
