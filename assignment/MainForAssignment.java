package assignment;

public class MainForAssignment {
    public static void main(String[] args) {
        product p=new product();
        p.Setname("tea");
        p.Setprice(20.24);
        p.Setstock(5);
        p.Setproductid(954558);
        System.out.println(p.getprice());
        System.out.println(p.getStock());
        Customer c= new Customer(111,"youssef","youssefmohamed@gmail.com");
        Admin a=new Admin(122,"Admin youssef","Adminyoussefmohamed@gmail.com");
        c.placeOrder(p,4);
        c.placeOrder(p);
        a.updateProduct(p,40,10);

        Customer c1=new Customer(11,"youssef","youssef16");
        System.out.println(c1.getuserDetails());
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();
        creditCardPayment.validateCard();
    }
}
