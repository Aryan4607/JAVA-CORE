/*program to replace element with any number given and to add an element at the end of the array */

class ArraysIndex {
    public static void main(String[] args) {
        int[] arr = new int[] { 22, 3, 1, 55, 6, 77 };
        arr[1] = 4;
        int[] arr1 = new int[arr.length + 1];
        arr1[arr1.length - 1] = 30;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
        for (int j = 0; j < arr.length; j++) {
            arr1[j] = arr[j];

        }

        System.out.println(" ");

        for (int k = 0; k < arr1.length; k++) {
            System.out.print(" " + arr1[k]);

        }

    }
}
