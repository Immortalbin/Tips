package decorator.discount;

import decorator.Product;

public class PerishableDiscount extends ProductDecorator {

    public PerishableDiscount(Product product){
        this.product = product;
        this.discount = 0.20;
    }
}
