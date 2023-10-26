// Class ShoppingItem
public class ShoppingItem {
    // Class Properties (Data Members)
    private String name; // Name of shopping item
    private int quantity; // quantity
    private double price; // price per unit

    // CONSTRUCTOR (Parameterized)
    // Constructs an item order to purchase the item with the given name, in the
    // given quantity, which costs the given price per unit
    public ShoppingItem(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.price = pricePerUnit;
    }

    // Class Methods (Data Methods)
    // METHOD 1 : returns the name of this item
    public String getName() {
        return name;
    }

    // METHOD 2 : returns the total cost of this item in its given quantity. For
    // example, four boxes of cookies that cost 2.30 per unit have a total cost of
    // 9.20
    public double getCost() {
        return quantity * price;
    }

    // METHOD 3 : sets this grocery item’s quantity to be the given value
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // METHOD 4 : returns quantity and the shipping item name separated by space.
    // For example, the method will return “3 Eggs” given the shopping item name is
    // Eggs, and the quantity is 3.
    public String toString() {
        return quantity + " " + name;
    }
}


// By- Vansh Sikka
