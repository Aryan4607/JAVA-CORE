
class Program1 {
    public static void main(String[] args) {

        String s1 = "   Hi, My   Name is Aryan   ";

        String result = s1.trim();
        String result1 = result.toUpperCase();
        String result2 = result1.replaceAll("ARYAN", "PREM");

        System.out.println(result2);

    }

}
