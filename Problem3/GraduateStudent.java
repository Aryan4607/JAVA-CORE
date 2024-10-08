
class GraduateStudent extends Student3 {

    GraduateStudent(int RollNumber) {
        super(RollNumber);
    }

    void CalculateGrade() {
        System.out.println("Grade Calculated based on graduate criteria for roll number :" + RollNumber);
    }

    void CalculateGrade(String subject) {
        System.out.println("Grade for " + subject + " Calculated for roll number: " + RollNumber);

    }

    int getRollNumber() {
        return RollNumber;
    }

}
