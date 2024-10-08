
class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int j = 100;
        int sum = 0;

        while (i <= j) {
            sum = sum + i;

            System.out.println(i);
            i++;

        }
        System.out.println(sum);

    }

}
