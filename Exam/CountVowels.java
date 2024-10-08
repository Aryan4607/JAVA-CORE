class CountVowels {
    public static void main(String[] args) {
        int vow = 0;
        int con = 0;

        String s = "AryanPrem";
        String s1 = s.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {

            switch (s1.charAt(i)) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    vow++;
                    break;
                default:
                    con++;

            }

        }
        System.out.println("total number of vowels:" + vow + "\n" + "total number of consonant: " + con);
    }

}
