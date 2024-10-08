
class EvenorOdd {

    public static void main(String[] args) {

        int[] arr = new int[] { 2, 4, 8, 99, 55, 3, 6, 77 };

        for (int i = 0; i < arr.length; i++) {
            if (0 == arr[i] % 2) {
                System.out.println("Even numbers:" + " " + arr[i]);

            }

            else {
                System.out.println("odd numbers:" + " " + arr[i]);
            }
        }

    }

}
