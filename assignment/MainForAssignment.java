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
    }
}
