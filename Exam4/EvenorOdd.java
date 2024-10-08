
class EvenorOdd {
    public static void main(String[] args) {

        int[] arr = new int[] { 2, 44, 11, 33, 8, 22 };
        int Even = 0;
        int odd = 0;

        System.out.println("even numbers :");

        for (int i = 0; i < arr.length; i++) {
            if (0 == (arr[i] % 2)) {

                System.out.println(arr[i]);

            }
        }
        System.out.println("odd numbers :");

        for (int j = 0; j < arr.length; j++) {
            if (0 != (arr[j] % 2)) {
                System.out.println(arr[j]);

            }

        }

    }
}
