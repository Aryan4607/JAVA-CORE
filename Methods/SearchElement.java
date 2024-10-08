class SearchElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 44, 55, 66, 77 };
        System.out.println(Search(arr, 44));

    }

    static int Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;
    }

}
