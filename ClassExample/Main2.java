
/*create 3 objects of 3 difeerent students and find which one is the oldest and the 
 * youngest among these three
 */
class Main2 {

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.age = 21;
        s1.rollno = 22;
        s1.name = "prem";

        Student1 s2 = new Student1();
        s2.age = 20;
        s2.rollno = 23;
        s2.name = "Aryan";

        Student1 s3 = new Student1();
        s3.age = 19;
        s3.rollno = 24;
        s3.name = "om";

        if ((s1.age > s2.age) && (s1.age > s3.age)) {
            System.out.println(s1.name + " is the oldest");
        } else if ((s2.age > s1.age) && (s2.age > s3.age)) {
            System.out.println(s2.name + " is the oldest");

        }

        else {
            System.out.println(s3.name + "is the oldest");
        }

        if ((s1.age < s2.age) && (s1.age < s3.age)) {
            System.out.println(s1.name + " is the youngest");
        }

        else if ((s2.age < s1.age) && (s2.age < s3.age)) {
            System.out.println(s2.name + " is the youngest");
        }

        else {
            System.out.println(s3.name + "is the youngest");
        }

    }

}