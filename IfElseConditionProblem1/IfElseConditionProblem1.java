
class IfElseConditionProblem1 {

    public static void main(String[] args) {

        int age = 21;

        if (age >= 18) {
            System.out.println("person is eligible to Vote ");

        } else if (age < 0) {
            System.out.println("Wrong information is provided ");
        }

        else if (age < 18) {
            System.out.println("person is not eligible to vote");
        }

    }

}
