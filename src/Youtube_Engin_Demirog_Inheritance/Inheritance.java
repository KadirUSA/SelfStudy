package Youtube_Engin_Demirog_Inheritance;

public class Inheritance {
    public static void main(String[] args) { // related to Costumer, Employees, EmployeeManager, CostumerManager, Person and PersonManager Class
        Employees employees = new Employees();
        Costumer costumer = new Costumer();

        CostumerManager costumerManager = new CostumerManager();
        EmployeeManager employeeManager =new EmployeeManager();

        costumerManager.Add();
        costumerManager.Removed();
        costumerManager.List();

        System.out.println("..................");

        employeeManager.BestEmployeeOfTheMonth();
        employeeManager.Add();
        employeeManager.Removed();
        employeeManager.List();

        System.out.println("..................");

/*................................................................*/

        costumer.id = 8684;
        costumer.firstName = "Kadir";
        costumer.lastName = "Dalcicek";
        costumer.age = 38;
        costumer.email = "expers14@hotmail.com";

        employees.id = 8682;
        employees.firstName = "Kadir";
        employees.lastName = "Dalcicek";
        employees.age = 38;
        employees.salary = 3.500;

        System.out.println(costumer.lastName +"\r\n"+ costumer.firstName  + "\n"+ costumer.id + "\r\n" + costumer.age + "\r" + costumer.email);


    }
}
