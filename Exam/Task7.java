
class Task7 {

    public static void main(String[] args) {

        int f1 = 0;
        int f2 = 1;
        int f3;
        int n = 10;

        System.out.print(f1 + " " + f2);

        for (int i = 0; i < n - 2; i++) {

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            System.out.println(f3);

        }
    }

}
