
class Average {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 44, 33, 11, 12 };

        System.out.println(getaverage(arr));

    }

    static int getaverage(int arr[]) {
        int sum = 0;
        int result;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        result = sum / arr.length;

        return result;

    }

}
