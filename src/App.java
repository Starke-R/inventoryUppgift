public class App {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Big Heckin' Sword", 100, 5, 50);
        Armour armour = new Armour("Shiny Armour", 50, 100, 150, "Steel");
        Consumable potion = new Consumable("Mana Potion", 50, 1, "mana");
        
        Player player = new Player("Gargamel");

        Item trash = new Item("Goblin Tooth", 1, 5);
        Boss boss = new Boss("Goblin", 50, trash, "Goblin King");
        
        player.pickUpItem(sword); 
        player.pickUpItem(potion); 
        player.pickUpItem(armour); 
        player.showInventory();

        boss.surpriseAttack(player);
        player.showInventory();

    }
}
