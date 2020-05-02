package Youtube_Engin_Demirog1;

import java.util.Scanner;

class strings_9 {
    public static void main(String[] args) {

        String message = "Today weather is nice";
        System.out.println(message);

        System.out.println("Number of elements in this string is " + message.length());
        System.out.println("Element of number 5 is :" + message.charAt(4));
        System.out.println(message.concat(" Lets go out"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("!"));
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.length());
        //System.out.println(message.replace(oldChar' ', newChar'-'));
        System.out.println(message.replace("nice", "great!"));
        String new_message = message.replace("Today weather is", "" +
                "Yesterday weather was");
        System.out.println(new_message);
        System.out.println(message.substring(2));
        System.out.println(message.substring(2, 14));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}

class even_or_Odd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

    }
}

class even_or_Odd_Practice {
    public static void main(String[] args) {


        int num1 = 20;
        int num2 = 30;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }


    }
}

class find_Vowel_Letters {
    public static void main(String[] args) {

        char letter = 'a';


        if (letter == 'A' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " bir kalin sesli harftir");
            return;

        }
        if (letter == 'E' || letter == 'I') {
            System.out.println(letter + " bir ince sesli harftir");
            return;
        } else {
            System.out.println(letter + " ne kalin ne de ince bir harftir");
        }

    }
}

class practice3 {
    public static void main(String[] args) {

        int num = 9;
        boolean prime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(num + " is a Prime");
        } else {
            System.out.println(num + " is not a Prime");
        }

    }
}

class primeNumberPractice {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num = reader.nextInt();
        boolean isPrime = true;

        if (num == 1) {
            System.out.println(num + " is a Prime number");
            return;
        }


        if (num < 2) {
            System.out.println(num + " invalid number");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }

    }
}

class primeNumberPractice1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = reader.nextInt();
        boolean b = true;

        for (int i = 2; i < num; i++) {
            b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { //true
                    b = false;
                    //   System.out.println(i + " is not a Prime number");
                    // also possible
                    break;
                }
            }
            if (b) {
                System.out.println(i + " is a Prime number");
            } else {
                System.out.println(i + " is not a Prime number");
            }
        }

    }
}

class primeNumberPractice2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = reader.nextInt();
        boolean isPrime = true;

        if (num == 1) {
            System.out.println("1 is not a Prime number");
            return;
        }

        if (num < 1) {
            System.out.println(num + " is not a Prime number");
            return;
        }

        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }

    }
}


