package Youtube_Engin_Demirog1;

public class Methods {
    public static void main(String[] args) {


        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 9};
        int find_number = 9;
        boolean b = false;

        for (int num : numbers) {
            if (num == find_number) {
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println(find_number + " is in the array");
        } else {
            System.out.println(find_number + " is not in the array");
        }
    }

    public static void typMessage(int find_number) { // find_number is a parameter here
        System.out.println("Number is not found" + find_number);
    }
}

//************* Variable Argument***************8//

class methods2 { // **public : it is a access specifier that means it will be accessed by publically.
    // **static : it is access modifier that means when the java program is load then it will
    // create the space in memory automatically.
    // **void : it is a return type i.e it does not return any value.
    // **main() : it is a method or a function name.
    public static void main(String[] args) {
        String note = "Today is cool!";
        String new_not = note.substring(0, 3);
        System.out.println(new_not);
        System.out.println(note);
        System.out.println(update2(9.78));
        update1(9.78);
        add();
        delete();
        update();
        System.out.println(update3());
        System.out.println(update4());
        int total = sum(8, 5); // 8 and 5 are parameters or arguments(args)
        System.out.println(sum(7, 9));
        System.out.println(total);
        System.out.println(sum2(3,4,38,5,5,3,7));
        //or
        int new_sum = sum2(9,8,7,6,99,75);
        System.out.println(sum2(5,6,4,4));
    }

    public static void add() {
        System.out.println("It has been added");
    }

    public static void delete() {
        System.out.println("It has been deleted");
    }

    public static void update() {
        System.out.println("It has been updated");
    }


    public static void update1(double myDouble) {
        //double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println(myInt);
    }

    public static int update2(double myDouble) {
        int myInt = (int) myDouble;
        return myInt;
    }

    public static int update3() {
        double d = 7.65;
        int i = (int) d;
        return i;
    }

    public static double update4() {
        int i = 7;
        double d = (double) i;
        return d;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum2(int... numbers) {
        int sum2 = 0;
        for (int num : numbers) {
            sum2 += num;
        }
return sum2;
    }
}





