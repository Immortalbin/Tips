package decorator.discount;

import decorator.Product;

public abstract class ProductDecorator extends Product{

    Product product;

    double discount;

    @Override
    public String getPrice() {
        return String.valueOf(Double.parseDouble(product.getPrice()) * ( 1 - discount ));
    }

}
