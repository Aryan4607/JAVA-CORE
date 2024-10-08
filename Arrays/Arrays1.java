/*program to print sum of all the element in the  array */
class Arrays1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 44, 55, 66 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("sum of all the elements:" + sum);

    }
}