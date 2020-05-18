package Youtube_Engin_Demirog_AbstractClasses;

public class Main1 {
    public static void main(String[] args) {

    CostumerManager1 costumerManager1 = new CostumerManager1();
    costumerManager1.baseDataBaseManager1 = new OracleDataBaseManager1();
        costumerManager1.getCostumers();
        // Burasi cok ama cok onemli. CostumerManagerda
        // data sini nereden almasi gerektigini soyledin. Burda da BaseDataBaseManager hem Oracle in hem SQL in annesi oldugu icin
        // CostumerManagerin icinde olusturdugun baseDataManager1 objesi ile diyorsun ki Oracle veya istersen SQL deki verileri
        // cagirabilirsin. baseDataBaseManager1 objesi ile onlarin istedigini ulasabilirsin. Hatta sonradan ekleyecegin baska
        // siniflari da BaseDataBaseManager1 extends edip onlara daha cok kolay bir sekilde ulasabilirsin.

    costumerManager1.baseDataBaseManager1 = new SQLServerDataBaseManager1();
    costumerManager1.getCostumers();


    }
}
