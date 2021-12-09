public class Product {
    private String name;
    private BYN price;

    public Product(BYN price) {
        this.price = price;
    }
    public Product(){}

    public BYN getPrice() {
        return price;
    }

    public BYN getCost() {
        BYN innerPrice = new BYN(price);
        AbstractPurchase abs = new AbstractPurchase(getNumber);
        innerPrice.mul(abs.getNumber());
        return innerPrice;
    }

    public void setPrice(BYN price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "PRICE=" + price +
                '}';
    }
}
