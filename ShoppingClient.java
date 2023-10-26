import java.util.*;

// Main Class : Shopping Client
public class ShoppingClient {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        // Menu-Driven Loop
        while (choice != 5) {
            // User Input Validation
            System.out.print("Press your choice from 1 to 5: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // Display the menu
                    System.out.println("Menu:");
                    System.out.println("1. Display the menu");
                    System.out.println("2. Add a shopping item");
                    System.out.println("3. Change the quantity of an item in shopping list");
                    System.out.println("4. Display the shopping list");
                    System.out.println("5. Exit");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter the shopping item: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter the price: ");
                    double price = scanner.nextDouble();
                    ShoppingItem newItem = new ShoppingItem(itemName, quantity, price);
                    if (shoppingList.add(newItem)) {
                        System.out.println("Item added to the shopping list.");
                    } else {
                        System.out.println("Shopping list is full. Item not added.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter the item name to change quantity: ");
                    String itemToChange = scanner.nextLine();
                    ShoppingItem foundItem = shoppingList.searchByName(itemToChange);
                    if (foundItem != null) {
                        System.out.print("Enter the new quantity: ");
                        int newQuantity = scanner.nextInt();
                        foundItem.setQuantity(newQuantity);
                        System.out.println("Quantity updated successfully.");
                    } else {
                        System.out.println("Item not found in the shopping list.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println(shoppingList.toString());
                    System.out.println("Total Cost: " + shoppingList.getTotalCost());
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    System.out.println();
            }
        }
        scanner.close();
    }
}

// By - Vansh Sikka