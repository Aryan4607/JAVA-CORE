class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.name = "Aryan";
        e1.employeeID = 11;
        e1.Department = "manager";

        Employe e2 = new Employe();
        e2.name = "NAchi";
        e2.employeeID = 12;
        e2.Department = "CEO";

        System.out.println(e1.getname());
        System.out.println(e1.getemployeeID() + "\n");

        System.out.println(e2.getname());
        System.out.println(e2.getDepartment());

    }
}