package lesson1;

public class Task2 {
    static void main(String[] args) {
        float productPrice = 199.99F;
        int discount = 20;
        float finalPrice = productPrice - (productPrice * discount / 100);

        System.out.println("Original Price: " + productPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}
