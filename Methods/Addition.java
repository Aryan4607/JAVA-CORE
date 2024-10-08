/*write method  for addition and multiplication of two numbers   */
class Addition {
    public static void main(String[] args) {

        System.out.println(getaddition(2, 4));
        System.out.println(getmultiplication(2, 4));

    }

    static int getaddition(int a, int b) {
        return a + b;

    }

    static float getmultiplication(int a, int b) {
        return (float) (a * b);
    }

}
