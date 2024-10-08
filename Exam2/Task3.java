
class Task3 {

    public static void main(String[] args) {
        String[] arr = new String[] { "a", "b", "c", "2", "5" };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("[a-z]")) {

            } else {
                count++;
            }

        }
        System.out.println("String cointains number of  digits :" + count);

    }
}
