class Equalsto {

    public static void main(String[] args) {

        String s1 = "hello world";
        String s2 = "HELLO WORLD";

        String s3 = new String("hello world");
        String s4 = "   hello world ";
        String s5 = "hello everyone hello everyone";

        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true
        System.out.println(s2.equals(s3));// true
        System.out.println(s1 == s3);// false

        // String Functions
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s4.trim());

        // replace funactions

        System.out.println(s1.charAt(3));
        System.out.println(s1.replace("hello", "hi"));
        System.out.println(s5.replaceAll("hello", "hi"));
        System.out.println(s5.replaceFirst("hello", "hi"));
        System.out.println(s5.replaceFirst("h", "y"));

    }
}