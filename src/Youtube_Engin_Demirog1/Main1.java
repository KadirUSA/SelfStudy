package Youtube_Engin_Demirog1;

public class Main1 {

    public static void main(String[] args) {
        Product1 product1 = new Product1(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah"); // Product1 class constructor has been started
        // The constructor above is with parameters

        /*Product1 product1 = new Product1(); // both constructors will be working.
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Asus Laptop");
        product1.setPrice(5000);
        product1.setStockAmount(3);
        product1.setRenk("Siyah");
        product1.getCode();*/

        ProductManager1 productManager1 = new ProductManager1(); // ProductManager1 class constructor has been started
        productManager1.Add(product1);

        //ProductManager1 related
        /*public void Add ( int id, Stirng name, String description,int stockAmount, double price){ }
        public void Add ( int id, Stirng name, String description,int stockAmount, double price){ }
        public void Add ( int id, Stirng name, String description,int stockAmount, double price){ }*/

        System.out.println(product1.getCode());
        System.out.println();


    }
}
