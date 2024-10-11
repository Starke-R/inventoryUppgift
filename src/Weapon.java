// Weapon är en subklass av Item och använder sig av Equippable interfacet


public class Weapon extends Item implements Equippable {
    private int damage;
    private String type;  

    public Weapon(String name, int worth, int weight, int damage) {
        super(name, worth, weight);
        this.damage = damage;
        this.type = "Weapon";  
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void equip() {
        System.out.println(getName() + " has been equipped.");
        System.out.println(); 
    }

    @Override
    public void unequip() {
        System.out.println(getName() + " has been unequipped.");
        System.out.println(); 
    }

    @Override
    public String toString() {
        return super.toString() + " It's a " + type + " and it deals +" + damage + " in damage.";
    }
}
