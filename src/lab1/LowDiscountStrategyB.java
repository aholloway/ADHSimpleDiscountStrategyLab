package lab1;

/**
 *
 * @author aholloway
 */
public class LowDiscountStrategyB implements DiscountStrategy {

    public double returnDiscount(double price) {
        return .15 * price;
    }
}
