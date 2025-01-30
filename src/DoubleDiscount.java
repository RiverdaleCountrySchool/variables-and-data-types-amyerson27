public class DoubleDiscount {
    public static void main(String[] args) {
        int price;
        price = 25;
        double discount;
        discount = 0.15;
        double finalPrice;
        finalPrice = price - price * discount;
        System.out.println("The sale price is $" + finalPrice);
    }
}