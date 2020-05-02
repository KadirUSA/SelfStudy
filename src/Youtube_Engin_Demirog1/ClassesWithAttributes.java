package Youtube_Engin_Demirog1;

public class ClassesWithAttributes { // related to Product Class
    public static void main(String[] args) {

        //***Construction
        Products products = new Products(12345, "Asus Laptop", 1.250, "14 inc screen size, 8GB Ram, 515GB storage, intel i7", 20, "Gray", 2.65, "A12345");
        System.out.println(products.getDescription());

        //***Encapsulation  ***Getter ***Setter
        products.setName("Asus Laptop");
        products.setId(12345);
        products.setWeight(2.65);
        products.setColor("Gray");
        products.setPrice(250); // It should return error. Because at Product class there is a condition that price can not be below 1.000
        products.setDescription("14 inc screen size, 8GB Ram, 515GB storage, intel i7");
        products.setStock(20);
        //products.setCode("This is code"); also ok

        System.out.println(products.getCode());
        System.out.println(products.getPrice());
        ProductManager productManager = new ProductManager();
        productManager.Info(products); // no need to write this ***System.out.println(products.name);

        productManager.Info2(26, 12345, "Asus Leptop", "White", 2.5); //Look for ProductManager Class for error
        productManager.Info2(26, 12345, "Asus Leptop", "White", 2.5);
        productManager.Info2(26, 12345, "Asus Leptop", "White", 2.5);
        productManager.Info2(26, 12345, "Asus Leptop", "White", 2.5);
        productManager.Info2(26, 12345, "Asus Leptop", "White", 2.5);
        // This is Encapsulation. You write everything in a capsule. You don not allow anyone can
        // change it easily


    }
}
