package lab1.solution;

import lab1.*;

/**
 *
 * @author aholloway
 */
public class ClearanceSale implements DiscountStrategy {

    public double returnDiscount(double price) {
        return 0.70 * price;
    }
}
