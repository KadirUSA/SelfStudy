package Youtube_Engin_Demirog1;

public class Calculator {
    public int sum(int num1, int num2) { // sum is "an Object" here. Name of class is Calculator and name of objects are:
                                        // sum(), extract(), multiple(), divide(), square(), square_root()
        return num1 + num2;
    }
    public int extract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    public int square(int num1) {
        return num1 = num1*num1;
    }
    public double square_root(double num1) {
        return Math.sqrt(num1);
    }
}

