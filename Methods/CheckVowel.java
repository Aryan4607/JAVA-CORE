/*create a method name vowelorconsonant give input as any charcter and output must be a vowel or consonant */

class CheckVowel {

    public static void main(String[] args) {
        System.out.println(vowelorconsonant('a'));

    }

    static String vowelorconsonant(char ch) {


        String result;

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                result = ch + " it is an vowel";
                break;

            default:
                if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A' && (ch <= 'Z')))) {
                    result = ch + "it is an consonant";

                } else {
                    result = "it is not an alphaber";

                }

        }
        return result;

    }

}
