class Main2 {
    public static void main(String[] args) {
        Person s = new Person("Aryan", "Indian");

        Person s1 = new Person("prem", "russian"); // as my instance viarable 'nationality, is initilalized final so it
                                                   // wont change

        Person.greet();

        s.displayinfo();

        s1.displayinfo();

    }

}
