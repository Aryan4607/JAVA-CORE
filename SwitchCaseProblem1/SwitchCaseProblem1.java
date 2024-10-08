class SwitchCaseProblem1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;

        String operation = "%";
        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "%":
                System.out.println(a % b);
                break;

            case "*":
                System.out.println(a * b);
                break;

            default:
                System.err.println("invalid input");
        }

    }
}
