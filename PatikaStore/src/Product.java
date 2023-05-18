public class Product {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private String brand;

    public Product(int id,String name,double price, String brand) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString(){
        return "Product{"+"" +
                "id="+ id+
                ", price="+price+
                ", discount="+discount+
                ", stock="+stock+
                ", name="+name +'\''+
                ", brand=" +brand+'\''+
                '}';
    }
}
