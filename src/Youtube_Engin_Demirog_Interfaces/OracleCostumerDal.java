package Youtube_Engin_Demirog_Interfaces;

public class OracleCostumerDal extends MySqlCostumerDal implements ICostumerDal , IRepository { // Bir class birdan fazla Interface i implements ve
    // en fazla da bir class i extends edebilir. Yani ayni anda bir classi ve istedigi kadar Interface i implements edebilir
    // Bu ornekte goruldugu gibi MySqlCostumerDal sinifi hem "ICostumerDal" hem de "IRepository" sinifini implement yapabilir
    //



    @Override
    public void add() {  // ***Bu methodu "ICostumerDal" Interface indan aldi.
        System.out.println("My Oracle has been added for ICostumerDal");
    } // The meaning of the DAL is "Data Access Layer" like we used Manager at the end of our classes before

    @Override
    public void remove() { // ***Bu methodu "IRepository" Interface indan aldi.
        System.out.println("My Oracle has been added for IRepository");
    }
}
