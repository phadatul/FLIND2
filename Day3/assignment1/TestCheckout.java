import checkout.*;

public class TestCheckout {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        {
            Candy candy = new Candy(200, 50);
            checkout.add(candy);
            System.out.println(checkout.size());
            System.out.println(checkout.totalCost());
        }

        {
            Cookie cookie = new Cookie(4, 10);
            checkout.add(cookie);
            System.out.println(checkout.size());
            System.out.println(checkout.totalCost());
        }

        System.out.println(checkout);
    }
}
