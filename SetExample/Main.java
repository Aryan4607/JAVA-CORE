import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        set1.add("Prem");
        set1.add("Aryan");
        set1.add("lokesh");
        set1.add("Prem");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Heamnt");
        set2.add("Aryan");
        set2.add("raj");

        set1.addAll(set2);

        System.out.println(set1);

        // for removing the common element use removeAll

        set1.removeAll(set2);
        System.out.println(set1);

        /* Intersection */

        set1.retainAll(set2);
        System.out.println(set2);

        System.out.println(set1.contains("Aryan"));

    }
}
