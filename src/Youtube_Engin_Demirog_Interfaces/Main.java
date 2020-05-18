package Youtube_Engin_Demirog_Interfaces;

public class Main {
    public static void main(String[] args) {


        ICostumerDal costumerDal = new OracleCostumerDal(); // This is a polymorphism instance
        IRepository iRepository = new OracleCostumerDal();
        costumerDal.add();
        iRepository.remove();

    }
}
