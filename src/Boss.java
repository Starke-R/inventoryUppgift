// Boss är en subklass av Enemy och använder sig av EnemyAttack interfacet


import java.util.Scanner;

public class Boss extends Enemy implements EnemyAttack {
    
    public Boss(String type, int health, Item loot, String name) {
        super(type, health, loot);
        this.name = name;
    }

    @Override
    public void surpriseAttack(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + " is attacking you! Counterattack? Y/N");
        String choiceAttack = scanner.nextLine();
        if (choiceAttack.equalsIgnoreCase("Y")) {
            System.out.println("I haven't written this code, but trust me, you killed him. ");
            System.out.println(name + " dropped some loot.");
            player.pickUpItem(loot); 
        }
    }

    @Override
    public String toString() {
        return super.toString() + " It's a " + name + " with " + health + "hp.";
    }
}
