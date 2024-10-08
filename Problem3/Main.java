class Main {

    public static void main(String[] args) {
        Student3 s = new Student3(101);

        GraduateStudent g = new GraduateStudent(102);

        GraduateStudent g1 = new GraduateStudent(33);

        s.CalculateGrade();

        g.CalculateGrade();

        g.CalculateGrade("MAths");

        s.getTotalStudents();

    }

}
