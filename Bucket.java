public class Bucket {
    private int capacity;
    private int amount;
    private String color;

    public Bucket(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
        this.amount = 0;
    }

    public Bucket(int capacity, String color, int amount) {
        this.capacity = capacity;
        this.color = color;
        this.amount = amount;
    }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean addWater(int water) {
        if (amount + water <= capacity) {
            amount += water;
            return true;
        }
        amount = capacity;
        return false;
    }

    public int compare(Bucket target) {
        if (this.amount > target.amount) return 1;
        else if (this.amount == target.amount) return 0;
        else return -1;
    }

    public String toString() {
        return "This " + color + " bucket has " + amount + " ml. It's max is " + capacity + "ml";
    }
}
