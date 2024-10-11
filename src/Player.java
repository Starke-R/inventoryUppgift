import java.util.Scanner;

public class Player {
    private static Player instance; 
    private String name;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public static Player getInstance(String name) {
        if (instance == null) {
            instance = new Player(name);
        }
        return instance;
    }


    public void pickUpItem(Item item) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Picking up " + item.getName() + ". Put in inventory? Y/N");
        String choiceInventory = scanner.nextLine();

        if (choiceInventory.equalsIgnoreCase("Y")) {
            inventory.addItem(item);

            if (item instanceof Equippable) { // Kollar så att Itemet i fråga använder sig av interfacet Equippable (dvs Weapon eller Armour)
                System.out.println("Equip item? Y/N");
                String choiceEquip = scanner.nextLine();
                if (choiceEquip.equalsIgnoreCase("Y")) {
                    equip((Equippable) item); 
                } 
            } 


            if (item instanceof Usable) { // Kollar så att Itemet i fråga använder sig av interfacet Usable (dvs Consumable)
                System.out.println("Consume item? Y/N");
                String choiceUse = scanner.nextLine();
                if (choiceUse.equalsIgnoreCase("Y")) {
                    consume((Usable) item); 
                    inventory.removeItem(item);
                } 
            } 


        } else {
            System.out.println("Dropping " + item.getName() + " back on the ground.");
            System.out.println(); 
        }
    }

    public void equip(Equippable item) {
        item.equip();  
    }

    public void consume(Usable item) {
        item.consume();  
    }

    public void discardItem(Item item) {
        System.out.println("Discarding: " + item.getName());
        System.out.println(); 
        inventory.removeItem(item);  
    }

    public void showInventory() {
        inventory.displayItems();
    }
}
