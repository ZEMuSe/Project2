public class AbstractPurchase implements Comparable <AbstractPurchase>  {
    private Product product;
    private int number;

    public AbstractPurchase(int number, Product product) {
        this.number = number;
        this.product = product;
    }
    public AbstractPurchase(){}

    public AbstractPurchase(BYN byn){}
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public BYN getCost(){
        BYN cost = new BYN();
        return product.getPrice().mul(number);
    }

    @Override
    public String toString() {
        return "AbstractPurchase{" + "number=" + number + ";" + getCost() + '}';
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return 0;
    }
}
