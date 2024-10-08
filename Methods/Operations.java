/*WJP methos to for multiplication, addition and substraction  */

class Operations {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 5, 3 };
        System.out.println(getMultiply(arr));

    }

    static int getadd(int... arr) {
        int sum = 0;
        int result = 0;

        for (int i : arr) {
            sum = sum + i;

            result = sum;

        }
        return result;

    }

    static int getMultiply(int... arr) {
        int mul = 1;
        int result = 0;

        for (int i : arr) {
            mul = mul * i;

            result = mul;

        }
        return result;
    }

    static int getsubstract(int... arr) {
        int sub = arr[0];
        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            sub = sub - arr[i];
            result = sub;

        }
        return sub;

    }

}