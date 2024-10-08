
class Student3 {

    final int RollNumber;
    static int TotalStudents = 0;

    Student3(int RollNumber) {
        this.RollNumber = RollNumber;
        TotalStudents++;
    }

    int RollNumber() {
        return RollNumber;
    }

    void CalculateGrade() {
        System.out.println("Grade calculated for roll number :" + RollNumber);

    }

    void getTotalStudents() {
        System.out.println("Total Student: " + TotalStudents);

    }

}
