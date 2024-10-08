
class Topper extends Student {

    int Marks;

    Topper(int Roll_no, String Name, char Div, int Marks) {
        super(Roll_no, Name, Div);

        this.Marks = Marks;

    }

    int getMarks() {
        return Marks;
    }

}
