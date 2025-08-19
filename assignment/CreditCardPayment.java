package assignment;

 class CreditCardPayment implements Payment {
    public void processPayment() {
        System.out.println("Credit Card Payment");
    }
    public void validateCard() {
        System.out.println("Credit Card is validate Payment");
    }
}
