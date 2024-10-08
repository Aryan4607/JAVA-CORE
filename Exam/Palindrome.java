class Palindrome {
    public static void main(String[] args) {
        String s1 = "NitiN";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += String.valueOf(s1.charAt(i)); // access s1's characters, not s2's
        }

        if (s1.equalsIgnoreCase(s2)) { // use equalsIgnoreCase for case-insensitive comparison
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}