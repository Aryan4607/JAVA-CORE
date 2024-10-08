
class Task8 {
    public static void main(String[] args) {

        int[] arr = new int[] { 2, 4, 3, 77, 1, 4, 8 };
        int prime;

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                System.out.println(arr[i] + "is a prime");

            }

        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;

        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
