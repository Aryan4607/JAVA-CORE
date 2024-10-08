class Person {

    String name;
    final String Nationality;

    String getname(String name) {
        return name;

    }

    String getNationality(String Nationality) {
        return Nationality;

    }

    Person(String name, String Nationality) {
        this.name = name;
        this.Nationality = Nationality;
        System.out.println("name :"+name);

    }

     void displayinfo(){
        System.out.println("This is a person named"+name+" and Nationality"+Nationality);

     }

     static void greet(){
        System.out.println("welcome to the system");

     }



}
