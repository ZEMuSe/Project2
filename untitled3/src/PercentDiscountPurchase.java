public class PercentDiscountPurchase extends AbstractPurchase{
    private final static int UNITS = 15;
    private double percent;

    public PercentDiscountPurchase(Product product, int number, double percent){
        super(number, product);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public BYN getCost(){
        BYN byn = new BYN();
        if (getNumber() > UNITS){
            byn.mul(1 - percent / 100);
        }
        return byn;
    }
    @Override
    public String toString() {
        return  super.toString() + ";" + percent;
    }
}
