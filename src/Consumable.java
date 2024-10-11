// Consumable är en subklass av Item och använder sig av Usable interfacet


public class Consumable extends Item implements Usable {
    private String effect;

    public Consumable(String name, int worth, int weight, String effect) {
        super(name, worth, weight); 
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public void consume() {
        System.out.println("Drinking the potion. ");

        switch (effect.toLowerCase()) {
            case "heal":
                System.out.println("You are healed!");
                System.out.println(); 
                break;
            case "buff":
                System.out.println("You feel stronger!");
                System.out.println(); 
                break;
            case "mana":
                System.out.println("Your mana is regenerating!");
                System.out.println(); 
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ...It's a " + effect + " potion.";
    }
}
