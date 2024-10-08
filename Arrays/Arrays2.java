/*Program to print the target element in the given array */
class Arrays2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 22, 44, 55, 22, 11 };
        int target = 22;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Target element found at index: " + i);
            }

        }

    }
}
