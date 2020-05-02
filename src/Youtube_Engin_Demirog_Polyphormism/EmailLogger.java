package Youtube_Engin_Demirog_Polyphormism;

public class EmailLogger extends BaseLogger {// Related to FileLogger, DatabaseLogger, EmailLogger, BaseLogger, CostumerManager and Polymorphism Classes
    public void log(String message) {/* this is overriding. I have received method from baseLogger but since
     this class extended to BaseLogger class I can use this method and according to my class needs*/

        System.out.println("Logged to Email: " + message);




    }
}
