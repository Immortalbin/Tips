package decorator.discount;

import decorator.Product;

public class SilverClientDiscount extends ProductDecorator {

    public SilverClientDiscount(Product product){
        this.product = product;
        this.discount = 0.05;
    }
}
