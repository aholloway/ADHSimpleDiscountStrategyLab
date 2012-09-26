package lab1;

/**
 *
 * @author aholloway
 */
public class BackToSchoolSale implements DiscountStrategy {

    public double returnDiscount(double price) {
        return .10 * price;
    }
}
