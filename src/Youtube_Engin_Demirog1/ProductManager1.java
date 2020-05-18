package Youtube_Engin_Demirog1;


public class ProductManager1 {
    public ProductManager1() {
        System.out.println("ProductManager1 constructor has been run too");
    }

    public void Add(Product1 product1) { //
        System.out.println("Urun eklendi " + product1.getName());
    }

    // 2. yontem olarak bu sekilde de verilebilir ama bu sefer ekstra bir ozellik ekledigimizde bu ozelligi gidip
    // butun o siniflardan da degistirmemiz gerekecek. Bundan dolayi yukardaki 1. Add daha duzgu, kisa ve saglikli
    // calisir
    /*public void Add(int id, Stirng name, String description, int stockAmount, double price) {
    } */

}
