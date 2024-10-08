import java.util.Scanner;

class Student4 {

    int age;
    String Name;
    char Gender;

    Student4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        age = sc.nextInt();

        System.out.println("enter name:");
        Name = sc.next();

        System.out.println("Enter Gender in M/F :");
        Gender = sc.next().charAt(0);

        try {
            if ((age >= 18)) {
                System.out.println("valid age");
                System.out.println("Name" + Name);
                System.out.println("Age" + age);
                System.out.println("Gender " + Gender);

            } else {
                throw new MyException1("Age is less than 18");

            }

        } catch (MyException1 e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }

}
