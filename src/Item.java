public class Item {
    protected String name;
    protected int value;
    protected int weight;

    public Item(String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " - " + value +" gold" + " and " + weight + "kg in weight.";
    }
}
