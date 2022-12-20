package Prac06;


public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold(1111, "30 gallon aquariam", 39.99);
        ItemSold item2 = new ItemSold(2222, "hamster wheel", 8.99);
        PetSold pet1 = new PetSold(3333, "Standard poodle", 639.99, true, true, false);
        PetSold pet2 = new PetSold(4444, "Siamese cat", 129.99, true, false, true);

        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }

    public static void display(ItemSold item) {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }

    public static void displayPetData(PetSold item) {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}