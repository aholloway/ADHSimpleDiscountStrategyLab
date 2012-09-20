package lab1;

/**
 *
 * @author aholloway
 */
public class NoDiscountStrategy implements DiscountStrategy {

    public double returnDiscount(double price) {
        return 0 * price;
    }
}
