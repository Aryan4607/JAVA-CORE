
/*WJP to print array in reverse order */
class ArraysRverse {
    public static void main(String[] args) {
        int[] arr = new int[] { 22, 44, 55, 22, 55 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }

    }
}
