package lab1;

/**
 * This sample class and its sub-classes do not follow the Strategy Pattern.
 * Revise the program in the lab1.solution package to use the pattern correctly.
 * Just copy the classes from the current package to the target package, and
 * then revise.
 *
 * Use the word "Strategy" in your strategy pattern class.
 *
 * @author jlombardo
 */
public abstract class Product {

    private DiscountStrategy discountStrategy;
    private static final String discountStrategyNullException="Error: Discount "
            + "strategy may not be null.";
    private static final String UNDEFINED = "undefined";
    //private static final double DEFAULT_DISCOUNT = 0;
    private String partName;
    private String partNumber;
    private String description;
    private double price;

    /**
     * Sub-class authors should override this to do their bidding. Defaults to
     * no discount (0%).
     *
     * @return price * discount percent
     */
    //public double getDiscountInDollars() {
    //    return price * DEFAULT_DISCOUNT;
    //}
    
    public final double getDiscountInDollars(){
        return price * discountStrategy.returnDiscount();
    }

    public final String getPartName() {
        return partName;
    }

    public final void setPartName(final String partName) {
        if (partName == null || partName.length() == 0) {
            this.partName = UNDEFINED;
        }
        this.partName = partName;
    }

    public final String getPartNumber() {
        return partNumber;
    }

    //should be final
    public final void setPartNumber(final String partNumber) {
        if (partNumber == null || partNumber.length() == 0) {
            this.partNumber = UNDEFINED;
        }
        this.partNumber = partNumber;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        // No need to validate, optional
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        if (price < 0) {
            this.price = 0;
        }
        this.price = price;
    }

    //Allows users to change discount strategy at runtime
    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        //validation to prevent null values from being passed in.
        if (discountStrategy==null){
            throw new IllegalArgumentException(discountStrategyNullException);
        }
        this.discountStrategy = discountStrategy;
    }
}
