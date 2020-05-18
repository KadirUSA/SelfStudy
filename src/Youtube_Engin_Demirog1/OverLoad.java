package Youtube_Engin_Demirog1;

public class OverLoad {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        System.out.println(dortIslem.sum(9,6));
        System.out.println(dortIslem.sum(30,5,15)); // Overload method output
        System.out.println(dortIslem.sum(4,5,7));   // Overload method output

        int sum_result = dortIslem.sum(33,11);
        int subtraction_result = dortIslem.subtraction(25,14);
        int multipication_result = dortIslem.multipication(15,5);
        int division_result = dortIslem.division(56, 4);

        System.out.println(sum_result);
        System.out.println(subtraction_result);
        System.out.println(multipication_result);
        System.out.println(division_result);



    }
}
