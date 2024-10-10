import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Putting " + item.getName() + " in the inventory.");
        System.out.println();
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Removing " + item.getName() + " from the inventory.");
        System.out.println();
    }

    public void displayItems() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("View inventory? Y/N");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            if (items.isEmpty()) {
                System.out.println("No items in the inventory.");
            } else {
                System.out.println("Inventory contains:");
                for (Item item : items) {
                    System.out.println(item.toString());
                }
                System.out.println(); 
            }
        }
        
    }

    public List<Item> getItems() {
        return items;
    }
}