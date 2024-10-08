import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String Name;
        int Age;
        int Option;

        ArrayList<Student1509> s1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1.Add astudent");
            System.out.println("2.Show Student list");
            System.out.println("3.Exit");
            System.out.println("Choose an option");

            Option = sc.nextInt();

            switch (Option) {
                case 1: {

                    System.out.println("Enter Name and Age of Student");
                    Name = sc.next();
                    Age = sc.nextInt();

                    Student1509 s = new Student1509(Name, Age);
                    s1.add(s);
                    break;

                }

                case 2: {
                    for (Student1509 m : s1) {
                        m.DisplayStudent();
                    }
                    break;

                }

            }

        }

        while (Option != 3);
    }

}
