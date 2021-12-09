
public class PriceDiscountPurchase extends AbstractPurchase{
    private BYN discount;

    public PriceDiscountPurchase(Product product, int number, BYN discount){
        super(number, product);
        this.discount = discount;
    }

    public BYN getDiscount() {
        return discount;
    }

    public void setDiscount(BYN discount) {
        this.discount = discount;
    }

    @Override
    public BYN getCost() {
        BYN byn = new BYN();
        return byn.sub(discount).mul(getNumber());
    }
    @Override
    public String toString() {
        return  super.toString() + ";" + discount;
    }

}

