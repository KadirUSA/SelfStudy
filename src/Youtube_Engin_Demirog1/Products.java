package Youtube_Engin_Demirog1;

public class Products { // related to ClassWithAttributes
    public Products(int id, String name, double price, String description, int stock, String color, double weight, String code) { // this is a Construction. It looks like a method but it si not a method.
        // The name must be the same as class name.
        System.out.println("Yapici blok calisti");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.color = color;
        this.weight = weight;
        this.code = code;
    }

    public Products() {
    }
        // Each class must have at least three topics;
        // 1. State/Attributes/Fields
        // 2. Behaviors/
        // 3. Identity/

        private int id;             //state,attributes or field
        private String name;        //state,attributes or field
        private double price;       //state,attributes or field
        private String description; //state,attributes or field
        private int stock;          //state,attributes or field
        private String color;       //state,attributes or field
        private double weight;      //state,attributes or field
        private String code;        //state,attributes or field

        //getter
        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;  //thi is means this id in this class. Look above

        }


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getPrice () {

            return price;
        }

        public void setPrice ( double price){
            if (this.price < 1.000) {
                System.out.println("Price can not be below 1.000 USD");
            }
            this.price = price;

        }

        public String getDescription () {
            return description;
        }

        public void setDescription (String description){
            this.description = description;
        }

        public int getStock () {
            return stock;
        }

        public void setStock ( int stock){
            this.stock = stock;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public double getWeight () {
            return weight;
        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

        public String getCode () {
            return this.name.substring(0, 1) + id;
        }

        public void setCode (String code){
            this.code = code;
        }
    }
