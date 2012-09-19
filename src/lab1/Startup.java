package lab1;

import java.text.NumberFormat;

/**
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        Product[] products = {
            new BaseballHat("Brewers Baseball Hat", "BH100", 19.95),
            new LeatherBelt("Men's Leather Dress Belt", "LB201", 39.50),
            new Socks("Women's Cotton Socks (Large)", "WS45", 25.88)
        };

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (Product p : products) {
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }



        System.out.println("");
        System.out.println("We changed the discounts:");
        for (Product p : products) {
            p.setDiscountStrategy(new Discount15PercentStrategy());
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }

        //unfortunately there appears to be bad code in the makeup of this class
        //the properties of the products can be changed (even though they were
        //declared final.  Also, the validation code does not seem to work. :(
        products[0].setPartName(null);
        products[0].setPartNumber("");
        products[0].setPrice(-2);

        System.out.println("");
        System.out.println("We tried to substitue bad data into the first "
                + "product in the array:");
        for (Product p : products) {
            p.setDiscountStrategy(new Discount15PercentStrategy());
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }
        System.out.println("And we were able to store these values.  Not sure "
                + "why though.");

    }
}
