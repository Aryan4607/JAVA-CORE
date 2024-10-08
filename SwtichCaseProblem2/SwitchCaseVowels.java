
class SwitchCaseVowels {
    public static void main(String[] args) {

        String Alphabet = "A";
        String Alphabet1 = Alphabet.toLowerCase();

        switch (Alphabet1) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(Alphabet + " is a Vowel");
                break;

            default:
                System.out.println(Alphabet + " is not a Vowel");

        }
    }

}
