class IfElseCondition {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int sum = a + b;

        if (sum < 0) {
            System.out.println("sum is less than zero:" + sum);
        } else if (sum > 0) {
            System.out.println("sum is greater than zero:" + sum);
        } else if (sum == 0) {
            System.out.println("sum is equal to zero" + sum);
        } else {
            System.out.println("sum");
        }

    }

}
