package Youtube_Engin_Demirog1;

public class Product1 {


    public Product1(int id, String name, String description, double price, int stockAmount, String renk) { // this is a costructor class. Name must be the same as class name. it is public. no void. It must be inside of the class. You can call it in main method only by its parameters. Otherwise it will not work
        // You have to set all parameters below for non-errors

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;


        System.out.println("Product1 constructor has been run with parameters");
    }

    public Product1() {
        System.out.println("Constructor without parameters will be working too");
    }


    private int id; // basta bunlarin hepsi publicti. ***private demek sadece tanimlandigi blockta gecerli.  Ama herkes bu sinifa ulasabilir ve bilgileri degistirebilir. Bunun icin bu sinifi private yapacagiz ve Encapsulation denilen ozellik baslamis olacak.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk; // sonradan eklenen bir ozellik ama problem degil. Sistem hata vermiyecek ve baska pencerelerden
    // degistirmeye gerek duyulmayacak. **product1 methodo ile rahatlikla her yere tasinabilecek. Bilgi icin ProductManager1 sinifina bakiniz
    private String code;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }

    /*public void setCode(String code) { bunun fix olmasini istiyorsaniz bunun ***set methodonu kaldirirsiniz ve sadece get kalir. ***get de bir conditiona bagli verilir
        this.code = code;
    }*/
}


