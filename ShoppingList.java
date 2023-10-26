// Class ShoppingList
public class ShoppingList {
    // Class Properties (Data Members)
    private ShoppingItem[] items; // Array field to store the shopping items
    private int size; // number of items in the list

    // CONSTRUCTOR
    // constructs a new empty ShoppingList.
    public ShoppingList() {
        items = new ShoppingItem[10];
        size = 0;
    }

    // Class Methods
    // METHOD 1 : adds the given item to this list if the list has fewer than 10
    // items. If the shopping list is full, return false. Return true if add is
    // successful.
    public boolean add(ShoppingItem item) {
        if (size < 10) {
            items[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    // METHOD 2 : returns the total sum cost of all shopping items in this list
    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    // METHOD 3 : returns String form of ShoppingList for example: ShoppingList has
    // 3 shopping items: 3 Milk, 4 Tissues, 1 Toothpaste If the ShoppingList is
    // empty, return “No Items in your shopping list”
    public String toString() {
        if (size == 0) {
            return "No Items in your shopping list";
        }

        StringBuilder sb = new StringBuilder("ShoppingList has " + size + " shopping items: ");
        for (int i = 0; i < size; i++) {
            sb.append(items[i].toString());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // METHOD 4 : searches an item in this list by its name. Return the item if
    // match is found, otherwise return null.
    public ShoppingItem searchByName(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                return items[i];
            }
        }
        return null;
    }
}

// By- Vansh Sikka
