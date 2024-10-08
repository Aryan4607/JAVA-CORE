
class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 33, 55, 11, 77 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];

            } else if (min > arr[i]) {
                min = arr[i];

            }

        }

        System.out.println("maximum : " + max);
        System.out.println("minium : " + min);

    }

}
