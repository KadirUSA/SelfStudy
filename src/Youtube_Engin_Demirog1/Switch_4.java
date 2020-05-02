package Youtube_Engin_Demirog1;

public class Switch_4 {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Great work! Passed");
                break;
            case 'B':
                System.out.println("Good job! Make it better!");
                break;
            case 'C':
                System.out.println("Well done. Work harder");
                break;
            case 'D':
                System.out.println("Fair! Work harder and make it better");
                break;
            case 'F':
                System.out.println("Try again. Faild!");
                break;
            default:
                System.out.println("Please enter the correct value");

        }
    }
}

