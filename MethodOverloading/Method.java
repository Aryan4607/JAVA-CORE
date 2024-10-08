
class Method {

    long Multiplication(int a, int b) {
        return a * b;

    }

    static long Multiplication(int a, int b, int c) {
        return a * b * c;

    }

    long Multiplication(int... a) {
        int mul = 1;
        for (int i : a) {
            mul = mul * i;

        }
        return mul;

    }

}
