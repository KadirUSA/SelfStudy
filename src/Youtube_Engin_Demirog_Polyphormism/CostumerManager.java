package Youtube_Engin_Demirog_Polyphormism;

public class CostumerManager {// Related to FileLogger, DatabaseLogger, EmailLogger, BaseLogger, CostumerManager and Polymorphism Classes
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger){
        this.logger = logger;

    }

    public void add(){
    System.out.println("Costumer has been added");
    this.logger.log("Log message");


}

}
