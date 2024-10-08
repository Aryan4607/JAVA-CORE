import Calculator.Add;
import Calculator.Division;
import Calculator.Sub;
import Calculator.Multiply;

class Main {
    public static void main(String[] args) {

        Add a = new Add(2, 5);
        Multiply m = new Multiply(2, 5);
        Sub s = new Sub(7, 5);

        System.out.println(Add.Calculation());

        System.out.println(Multiply.Calculation());

        System.out.println(Sub.Calculation());

    }
}
