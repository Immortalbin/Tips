package decorator.discount;

import decorator.Product;

public class GoldenClientDiscount extends ProductDecorator {

    public GoldenClientDiscount(Product product){
        this.product = product;
        this.discount = 0.10;
    }

}
