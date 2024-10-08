/*create class and object to make employee data 
 * data = employee id,name,department
 */

class Employe {

    int employeeID;
    String name;
    String Department;

    int getemployeeID() {
        return employeeID;

    }

    String getname() {
        return name;

    }

    String getDepartment() {
        return Department;

    }

    int setemployeeID(int employeeID) {
        this.employeeID = employeeID;
        return employeeID;

    }

    String setname(String name) {
        this.name = name;
        return name;

    }

    public String setDepartment(String Department) {
        this.Department = Department;
        return Department;

    }

}
