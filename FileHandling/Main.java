import java.io.FileWriter; // these are all classes of package of java.io
import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        String s1 = "Hello world!!";
        int ch;
        FileWriter fw = null;
        try {
            fw = new FileWriter("abc.txt");
            for (int i = 0; i < s1.length(); i++) {
                fw.write(s1.charAt(i));
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        FileReader fr = null;
        try {
            fr = new FileReader("abc.txt");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);

            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
