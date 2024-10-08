/*wjp to print even from a parameter var args implement method printevenno     */

class Evenno {

    public static void main(String[] args) {

        int[] arr = new int[] { 2, 4, 8, 33, 55, 44, 88 };
        getevenno(arr);

    }

    static void getevenno(int... arr) {

        for (int i = 0; i < arr.length; i++) {

            if (0 == arr[i] % 2) {
                System.out.print(" " + arr[i]);

            }

        }

    }

}
