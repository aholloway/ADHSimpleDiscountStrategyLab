package lab1;

/**
 *
 * @author jlombardo
 */
public class LeatherBelt extends Product {

    public LeatherBelt() {
    }

    public LeatherBelt(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(new Discount15Percent());
    }
    
//    @Override
//    public double getDiscountInDollars() {
//        return this.getPrice() * .15;
//    }

}
