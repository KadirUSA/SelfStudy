package Youtube_Engin_Demirog1;

public class Calculator_Return {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(6,9));
       // or
        int output = calculator.sum(10,25);
        System.out.println(output);

        System.out.println(calculator.extract(9,6));
        System.out.println(calculator.multiple(9,6));
        System.out.println(calculator.divide(36,6));
        System.out.println(calculator.square(9));
        System.out.println(calculator.square_root(144));

    }
}
