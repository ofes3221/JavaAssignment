package assignment;

class Customer extends User {
    private int quantity;
    public Customer(int userId, String username, String email) {
        super(userId, username, email);
    }

    public void placeOrder(product product, int quantity) {
        this.quantity = quantity;
        System.out.println(getusername() + " ordered " + quantity + " of " + product.getname());
    }
    public void placeOrder(product product) {

        System.out.println(getusername() + product.getname());
    }


    @Override
    public String getuserDetails() {
        return super.getuserDetails()+ " | Quantity: " + quantity;
    }
}
