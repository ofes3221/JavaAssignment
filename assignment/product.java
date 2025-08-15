package assignment;

public class product {
    private String name;
    private double price;
    private int productid;
    private int stock;

    void Setname(String name){
        this.name=name;
    }
    void Setproductid (int productid){
        this.productid=productid;
    }
    void Setprice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    void Setstock(int stock) {
        if (stock > 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

     double getprice() {
        return price;
    }

    int getStock() {
        return stock;
    }
}

