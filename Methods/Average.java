class Average {
    public static void main(String[] args) {
        int[] arr = new int[] { 22, 44, 55, 33, 77 };

        System.out.println(getaverage(arr));

    }

    static double getaverage(int... arr) {
        double sum = 0;
        for (double i : arr) {
            sum = sum + i;

        }
        return sum / arr.length;

    }

}
