
class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int j = 100;
        int sum = 0;

        do {
            sum = sum + i;
            System.out.println(i);
            i++;

        } while (i <= j);
    }
}
