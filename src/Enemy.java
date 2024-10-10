public class Enemy {
    protected String name;
    protected int health;
    protected Item loot; 

    public Enemy(String name, int health, Item loot) {
        this.name = name;
        this.health = health;
        this.loot = loot;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Item getLoot() {
        return loot;
    }

    @Override
    public String toString() {
        return super.toString() + " It's a " + name + " with " + health + "hp.";
    }
}
