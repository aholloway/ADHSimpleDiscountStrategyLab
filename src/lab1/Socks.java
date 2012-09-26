package lab1;

/**
 *
 * @author jlombardo
 */
public class Socks extends Product {

    public Socks() {
    }

    public Socks(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(new NoDiscount());
    }
    
}
