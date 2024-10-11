// Armour är en subklass av Item och använder sig av Equippable interfacet

public class Armour extends Item implements Equippable {
    private int protection;
    private String material;
    private String type;

    public Armour(String name, int value, int weight, int protection, String material) {
        super(name, value, weight);
        this.protection = protection;
        this.material = material;
        this.type = "Armour"; 
    }

    public int getProtection() {
        return protection;
    }

    public String getMaterial(){
        return material;
    }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public void equip() {
            System.out.println(name + " has been equipped.");
            System.out.println(); 
        }

        @Override
        public void unequip() {
            System.out.println(name + " has been unequipped.");
            System.out.println(); 
        }

    @Override
    public String toString() {
        return super.toString()+ " It's " + type + " made out of " + material + " and it offers +" + protection + " in protection.";
    }
}
