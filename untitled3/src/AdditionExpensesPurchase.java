public class AdditionExpensesPurchase extends AbstractPurchase{
    private BYN transportExpenses;
    public AdditionExpensesPurchase(Product product, int number, BYN transportExpenses){
        super(number, product);
        this.transportExpenses = transportExpenses;
    }

    public BYN getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(BYN transportExpenses) {
        this.transportExpenses = transportExpenses;
    }
    @Override
    public BYN getCost(){
        BYN byn = new BYN();
        return byn.mul();
    }
    @Override
    public String toString(){
        return super.toString() + ";" + transportExpenses;
    }
}
