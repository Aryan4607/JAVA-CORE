/*write a print to print the factorial of the given imput integer  */

class Factorial {
    public static void main(String[] args) {

        System.out.println(getfactorial(5));

    }

    static int getfactorial(int a) {

        int fact = 1;
        for (int i = 1; i <= a; i++) {

            fact = fact * i;

        }
        return fact;

    }
}
