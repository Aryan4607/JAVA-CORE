
/*Array list is a dynamic array were there is no given limit or size defined ,as input is given by user it saves the data in array form */
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();

        s.add("prem");
        s.add("aryan");
        s.add("raj");

        System.out.println(s);

        ArrayList<String> s1 = new ArrayList<>();

        s1.add("rohit");
        s1.add("nihar");
        s1.add("vaibhav");

        System.out.println(s1);
        System.out.println(s.lastIndexOf("aryan"));
        System.out.println(s.get(2));
        System.out.println(s.remove(1));

        System.out.println(s1.contains("vaibhav"));
    }
}