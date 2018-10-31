package decorator;


import decorator.discount.GoldenClientDiscount;
import decorator.discount.NotSellingProduct;
import decorator.discount.PerishableDiscount;
import decorator.discount.SilverClientDiscount;
import org.testng.annotations.Test;

@Test
public class DecoratorTest {

    public void testProductsWithDiscounts(){
        System.out.println("Cheese's price with silver discount: ");
        System.out.println(new SilverClientDiscount(new Cheese()).getPrice());
        System.out.println("Cheese's price with golden discount: ");
        System.out.println(new GoldenClientDiscount(new Cheese()).getPrice());
        System.out.println("Cheese's price with golden and silver discount: ");
        System.out.println(new GoldenClientDiscount(new SilverClientDiscount(new Cheese())).getPrice());
        System.out.println("Headphones's price with silver discount: ");
        System.out.println(new SilverClientDiscount(new Headphones()).getPrice());
        System.out.println("Milk's price with silver and perishable discount: ");
        System.out.println(new PerishableDiscount(new SilverClientDiscount(new Milk())).getPrice());
        System.out.println("My favorite Beer's product: ");
        System.out.println(new NotSellingProduct(new FavoriteBeer()).getPrice());

    }
}
