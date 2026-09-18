package clean_code.task2kiss;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.
                calculateDiscount(3.7, true, true, true));

        System.out.println(discountCalculator.
                calculateDiscount(2.0, false, false, false));
    }
}
