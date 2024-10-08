
class OddException {

    int n;

    OddException(int n) {
        this.n = n;

        try {
            if (n % 2 == 0) {
                System.out.println("Number is even");

            } else {
                throw new MyException("number is odd");

            }
        } catch (MyException e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());

        }

    }

}
