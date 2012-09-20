package lab1;

/**
 *
 * @author aholloway
 */
public class LowDiscountStrategyA implements DiscountStrategy {

    public double returnDiscount(double price) {
        return .10 * price;
    }
}
