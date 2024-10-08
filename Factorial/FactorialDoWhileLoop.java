
class FactorialDoWhileLoop {
    int n = 6;

    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        int fact = 1;

        do {
            fact = fact * i;
            i++;

        } while (i <= n);
        System.out.println(fact);
    }

}
