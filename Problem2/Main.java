
class Main {
    public static void main(String[] args) {
        Employe.setCompany("Tech mahindra");

        Employe e1 = new Employe(101, 200000);

        Manager m1 = new Manager(104, 2000000);

        e1.displaySalary();
        m1.displaySalary();

    }

}
