package decorator.discount;

import decorator.Product;

public abstract class ProductDecorator extends Product {

    Product product;

    double discount;

    @Override
    public double getPrice() {
        return product.getPrice() * (1 - discount);
    }

}
