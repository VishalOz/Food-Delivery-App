import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodDeliveryApp {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("PizzaButt");
        restaurant1.addItem(new MenuItem("Pepperoni Pizza",1200));
        restaurant1.addItem(new MenuItem("Margherita Pizza", 1500));
        restaurant1.addItem(new MenuItem("Margherita Pizza", 199));
        restaurant1.addItem(new MenuItem("Pepperoni Pizza", 299));
        restaurant1.addItem(new MenuItem("Veggie Supreme Pizza", 349));
        restaurant1.addItem(new MenuItem("Chicken Supreme Pizza", 399));
        restaurant1.addItem(new MenuItem("Farmhouse Pizza", 379));
        restaurant1.addItem(new MenuItem("Cheese Burst Pizza", 449));
        restaurant1.addItem(new MenuItem("Spicy Chicken Pizza", 429));

        Restaurant restaurant2 = new Restaurant("DineNoMore");
        restaurant2.addItem(new MenuItem("Chicken Fried Rice", 1000));
        restaurant2.addItem(new MenuItem("Pad Thai Noodles", 1200));
        restaurant2.addItem(new MenuItem("Sweet & Sour Chicken", 1100));
        restaurant2.addItem(new MenuItem("Vegetable Spring Rolls", 600));

        Restaurant restaurant3 = new Restaurant("DesertsScore");
        restaurant3.addItem(new MenuItem("Chocolate Lava Cake", 500));
        restaurant3.addItem(new MenuItem("Tiramisu", 600));
        restaurant3.addItem(new MenuItem("Ice Cream Sundae", 400));

        Restaurant restaurant4 = new Restaurant("BurgerQueen");
        restaurant4.addItem(new MenuItem("Classic Cheeseburger", 800));
        restaurant4.addItem(new MenuItem("Chicken Burger", 900));
        restaurant4.addItem(new MenuItem("Bacon BBQ Burger", 1100));
        restaurant4.addItem(new MenuItem("Veggie Burger", 700));

        List<Restaurant> restaurants = Arrays.asList(restaurant1, restaurant2, restaurant3, restaurant4);

        System.out.println("=====================================================");
        System.out.println("|                     CUBER Eats                     |");
        System.out.println("=====================================================");

        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i+1)+ ". "+ restaurants.get(i).getName());
        }
        System.out.print("Select a Restaurant: ");
        int choice = scanner.nextInt();
        

        if (choice < 1 || choice > restaurants.size()) {
            System.out.println("Invalid choice");
            return;
        }
        Restaurant selected = restaurants.get(choice - 1);
        System.out.println("\nYou selected: " + selected.getName());
        scanner.nextLine();
        selected.showMenu();
    }
}
