package Youtube_Engin_Demirog_Polyphormism;

import java.util.logging.Logger;

public class Polymorphism {// Related to FileLogger, DatabaseLogger, EmailLogger, BaseLogger, CostumerManager and Polymorphism Classes
    public static void main(String[] args) {

       /* BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DataBaseLogger(), new EmailLogger()};
              for (BaseLogger logger: loggers){
                  logger.log("Log message");
              }*/

         CostumerManager costumerManager = new CostumerManager(new DataBaseLogger());
          costumerManager.add();

        };


       /* BaseLogger baseLogger = new BaseLogger();
        baseLogger.log("Base has logged");

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Email has logged");

        FileLogger fileLogger = new FileLogger();
        fileLogger.log("File has logged");

        DataBaseLogger dataBaseLogger = new DataBaseLogger();
        dataBaseLogger.log("Database has logged");*/












    }

