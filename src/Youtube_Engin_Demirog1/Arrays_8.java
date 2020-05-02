package Youtube_Engin_Demirog1;

import java.util.Scanner;

class arrays_1 {

    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Karen";
        String name3 = "George";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("First temple has ended!");

        String[] names = new String[6];
        names[0] = "John";
        names[1] = "Karen";
        names[2] = "George";
        names[3] = "lee";
        names[4] = "Elizabeth";
        names[5] = "Alex";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("...................................");


        for (String name : names) {
            System.out.println(name);
        }
    }
}

class recap_Demo {
    public static void main(String[] args) {
        // first way
        double[] myList = {1.7, 1.4, 5.6, 7.3};

        // second way ........................
        //double mylist[] = new double[5];
        //num1[0] = 1.7;
        //num2[1] = 1.4;
        //num3[2] = 5.6;
        //nujm4[3] = 7.3;
        //....................................


        double sum = 0;
        double max = myList[0];
        double min = myList[0];


        // for (double i = 0; i<=3; i++) ---> Next page

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
            sum = number + sum;
            System.out.println(number);
        }


        System.out.println("Total of numbers is " + sum);
        System.out.println("Maximum number is :" + max);
        System.out.println("Minumum number is :" + min);




    }
}

class min_and_Max {

        public static void main(String[] args) {

            int[] myList1 = {2, 45, 65, 7, 6, 57, 45, 57, 85, 68, 5, 47};

            int sum = 0;
            int max = myList1[0];
            int min = myList1[0];

            for (int numbers : myList1) {
                sum = sum + numbers;

                if (max<numbers){
                    max = numbers;
                }
                if (min>numbers) {
                    min = numbers;
                }
            }



            System.out.println("Total of numbers is " + sum);
            System.out.println("Maximum number is " + max);
            System.out.println("Minimum number is " + min);
        }
}

class print_Options {
    public static void main(String[] args) {

        int[] myList2 = {2,45,65,7,6,57,45,57,85,68,5,47};
        {
            //first print solution
            System.out.println(java.util.Arrays.toString(myList2));
            System.out.println(myList2[3]);  // result will be 7

        }
        // second print solution

        for(int numbers:myList2) {

            System.out.println(numbers);
        }

    }
}

class practice {
    public static void main(String[] args) {

        double[] myList = {1.3, 1.4, 5.6, 7.3};

        for (double i = 0; i < myList.length; i++) ;
        {

            System.out.println(java.util.Arrays.toString(myList));
        }

        int[] intArr = {1, 4, 2, 6, 3};
        String[] strArr = {"E", "A", "U", "O", "I"};
        //sort int array
        java.util.Arrays.sort(intArr);
        java.util.Arrays.sort(strArr);
        {
            System.out.println(java.util.Arrays.toString(intArr));
            System.out.println(java.util.Arrays.toString(strArr));
        }

        int[] myNumbers = {2, 5, 8, 4, 56, 33, 46, 85, 345, 47, 45, 64, 654};
        java.util.Arrays.sort(myNumbers);
        {
            System.out.println(java.util.Arrays.toString(myNumbers));
        }
    }
}

class write_Arrays {

    public static void main(String[] args) {
        // write your code here

        int[] arr1 = {10, 20, 30, 40, 50};
        for (int i = 0; i <5; i++)
        /* for (int i = 0; i <arr1.lenght; i++)
        more secure */
        {
            System.out.println("Number is " + arr1[i]);
        }
        // OR
        int[] arr2 = new int[5];
        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        arr2[3] = 400;
        arr2[4] = 500;

        System.out.println(java.util.Arrays.toString(arr2));


    }
}
class get_Average_With_Function {

    public static void mean(int[] arr) {
        int total = 0;

        for (int value : arr) // or for (int i = 0; i < arr.length; i++)
        {total += value;      // total += i;
        }
        System.out.println("Average = " + total / arr.length);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr2 = new int[5];

        System.out.println("Please enter the value of arr2:...");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        mean(arr2);


    }
}
class add_Input_To_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[5];

        System.out.println("Please enter the value of arr2:...");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("arr2 value is being typed:...");

        for (int i = 0; i < arr2.length; i++){
            System.out.println("Number is " + arr2[i]);
        }

    }
}

class multi_Dimension_Array {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Kocaeli";
        cities[1][0] = "Ankara";
        cities[1][1] = "Nevsehir";
        cities[1][2] = "Konya";
        cities[2][0] = "Diyarbakir";
        cities[2][1] = "Mardin";
        cities[2][2] = "Urfa";

        System.out.println(cities[2][2] + " " +  cities[0][0] + " " + cities[1][1]);

        for(int i = 0; i <=2; i++){
            System.out.println(".................");
            for (int j = 0; j <=2; j++){
                System.out.println(cities[i][j]);
            }

        }

    }
}

