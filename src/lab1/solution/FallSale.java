package lab1.solution;

import lab1.*;

/**
 *
 * @author aholloway
 */
public class FallSale implements DiscountStrategy {

    public double returnDiscount(double price) {
        return .15 * price;
    }
}
