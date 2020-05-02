package Youtube_Engin_Demirog1;

public class DortIslem { //related to OverLoading class
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {  /*this is overload method. Method name is the same but parameters are different.
            first sum has 2 parameters, second sum has 3 parameters. System will execute both of them. See Overload class for reference*/
        return num1 + num2 + num3;

    }
}