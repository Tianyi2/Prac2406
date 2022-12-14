package Prac06;

public class ItemSold {
    private int invoiceNumber;
    private String description;
    private double price;
    public ItemSold(int invoiceNumber, String description, double price){
       setInvoiceNumber(invoiceNumber);
       setDescription(description);
       setPrice(price);
    }

    public void setInvoiceNumber(int num) {
        invoiceNumber = num;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
