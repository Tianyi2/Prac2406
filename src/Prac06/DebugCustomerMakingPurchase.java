package Prac06;

public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private final double amountOfPurchase;
    private final boolean overLimit;
    private DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount)
    {
        super(id, name, credit);
        this.amountOfPurchase = purchAmount;
        this.overLimit = amountOfPurchase > creditLimit;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Purchase amount $" + amountOfPurchase);
        if(overLimit)
            System.out.println("****Credit denied - customer over limit");
        else
            System.out.println("Purchase Okay");
    }
}