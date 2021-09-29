import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 3.50;

        item2.name = "latte";
        item2.price = 3.25;

        item3.name = "coffee drip";
        item3.price = 4.25;

        item4.name = "capuccino";
        item4.price = 3.50;

        // Order variables -- order1, order2 etc.
    
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order1.ready = true;

        // order 2
        order2.name = "Jimmy";
        ArrayList<Item> order2ItemList = new ArrayList<Item>();
        order2ItemList.add(item1);
        order2.items = order2ItemList;
        order2.total += item1.price;
        order2.ready = true;

        // order 3
        order3.name = "Noah";
        ArrayList<Item> order3ItemList = new ArrayList<Item>();
        order3ItemList.add(item4);
        order3.items = order3ItemList;
        order3.total += item4.price;

        // order 4
        order4.name = "Sam";
        ArrayList<Item> order4ItemList = new ArrayList<Item>();
        order4ItemList.add(item2);
        order4ItemList.add(item2);
        order4ItemList.add(item2);
        order4.items = order4ItemList;
        order4.total += item2.price;
        order4.total += item2.price;
        order4.total += item2.price;


        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
