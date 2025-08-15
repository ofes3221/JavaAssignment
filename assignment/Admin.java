package assignment;

public class Admin extends User {
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    public void updateProduct(product product, double newPrice, int newStock) {
        product.Setprice(newPrice);
        product.Setstock(newStock);
        System.out.println(getusername() + " updated " + product.getname() + " to price: " + newPrice + " and stock: " + newStock);
    }
}