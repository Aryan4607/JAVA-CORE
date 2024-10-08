/*WJP to get maximum and minimum number from the array */
class FindMaxandmin {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 44, 33, 77, 8, 1 };
        getmaxandmin(arr);

    }

    static void getmaxandmin(int... arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            } else if (min > arr[i]) {
                min = arr[i];

            }

        }
        System.out.println("Maximum no: " + max);
        System.out.println("Minium no: " + min);

    }

}
