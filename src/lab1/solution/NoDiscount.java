package lab1.solution;

import lab1.*;

/**
 *
 * @author aholloway
 */
public class NoDiscount implements DiscountStrategy {

    public double returnDiscount(double price) {
        return 0 * price;
    }
}
