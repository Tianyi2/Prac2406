package Prac06;

public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public PetSold(int invoiceNumber, String description, double price, boolean isVaccinated, boolean isNeutered, boolean isHousebroken){
        super(invoiceNumber, description, price);
        setIsVaccinated(isVaccinated);
        setIsNeutered(isNeutered);
        setIsHousebroken(isHousebroken);
    }

    public void setIsVaccinated(boolean isVac) {
        isVaccinated = isVac;
    }

    public void setIsNeutered(boolean isNeut) {
        isNeutered = isNeut;
    }

    public void setIsHousebroken(boolean isHb) {
        isHousebroken = isHb;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public boolean getIsNeutered() {
        return isNeutered;
    }

    public boolean getIsHousebroken() {
        return isHousebroken;
    }
}