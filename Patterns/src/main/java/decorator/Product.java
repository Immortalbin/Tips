package decorator;

public abstract class Product {

    double cost;

    public String getPrice() {
        return String.valueOf(cost);
    }
}
