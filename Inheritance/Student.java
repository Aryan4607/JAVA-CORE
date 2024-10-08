/*make a class and object with constructor roll no name and div and inherit student with topper  */
class Student {

    int Roll_no;
    String Name;
    char Div;
    

    int getRoll_no() {
        return Roll_no;

    }

    String getName() {
        return Name;
    }

    char getDiv() {
        return Div;

    }

    Student(int Roll_no, String Name, char Div) {
        this.Roll_no = Roll_no;
        this.Name = Name;
        this.Div = Div;

    }

}
