package decorator.discount;

import decorator.Product;

public class NotSellingProduct extends ProductDecorator {

    public NotSellingProduct(Product product){
        this.product = product;
    }

    @Override
    public String getPrice() {
        return "Priceless";
    }
}
