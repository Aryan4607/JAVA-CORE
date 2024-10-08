import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("prem", 1);
        map.put("Aryan", 2);
        map.put("prem", 3);
        map.put("lokesh", 4);

        System.out.println(map);

        // Iterate
        for (String i : map.keySet()) { // set views of keys
            System.out.print(i + " ");
        }

        for (Integer i : map.values()) { // set views of values
            System.out.println(i + " ");
        }

        System.out.println(map.get("prem")); // get value of the respective key

        map.replace("prem", 66);
        System.out.println(map);

        System.out.println(map.entrySet()); // set view of keys and values

    }

}
