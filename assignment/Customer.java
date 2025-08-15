package assignment;

class Customer extends User {
    public Customer(int userId, String username, String email) {
        super(userId, username, email);
    }

    public void placeOrder(product product, int quantity) {
        System.out.println(getusername() + " ordered " + quantity + " of " + product.getname());
    }

}
