package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class BaseballHat extends Product {

    public BaseballHat() {
    }

    public BaseballHat(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(new BackToSchoolSale());
    }
    
//    @Override
//    public double getDiscountInDollars() {
//        return this.getPrice() * .10;
//    }

}
