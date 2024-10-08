
class Student1509 {
    String Name;
    int Age;

    Student1509(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;

    }

    String getName() {
        return Name;
    }

    int getAge() {
        return Age;

    }

    void DisplayStudent() {

        System.out.println("Name :" + this.Name + "," + "Age :" + this.Age);

    }

}
