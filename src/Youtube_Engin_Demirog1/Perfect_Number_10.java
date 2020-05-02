package Youtube_Engin_Demirog1;

import java.util.Scanner;

class perfect_Number_10 {
    public static void main(String[] args) {

        int num = 28;
        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (num == total) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}

class Perfect_Number_Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = reader.nextInt();
        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (num == total) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}

class arkadas_Sayilar {
    public static void main(String[] args) {

        int num1 = 220;
        int num2 = 284;
        int total1 = 0;
        int total2 = 0;


        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                total1 += i;
            }
        }

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                total2 += i;
            }
        }
        if (total1 == num2 || total2 == num1) {
            System.out.println(num1 + " and " + num2 + " is a perfect number");
        } else {
            System.out.println(num1 + " and " + num2 + " is not a perfect number");
        }
    }
}

class find_A_Number_In_String {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 9};
        int find_number = 5;
        boolean b = false;

        for (int i = 0; i < numbers.length; i++) {
            if (find_number == i) {
                 b = true;
                 break;
            }
        }

        if (b) {
            System.out.println(find_number + " is in the array");
        }else{
            System.out.println(find_number + " is not in the array");
        }

    /* ***Second Solution
         int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 9};
         int find_number = 3;
         boolean b = false;

         for(int num: numbers){
             if (num == find_number){
                 b = true;
                 break;
             }
         }
        if (b) {
            System.out.println("number "  + find_number + " is found");
        }
        else {
            System.out.println("number "  + find_number + " is not found");
        }*/

    }
    }
