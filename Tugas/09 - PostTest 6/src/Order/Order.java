package Order;

import java.util.ArrayList;

import Menu.MenuItem;
import Util.IdGenerator;

public class Order {
    private String orderId;
    private ArrayList<MenuItem> items;

    public Order() {
        this.orderId = IdGenerator.generateUniqueId();
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getOrderId() {
        return orderId;
    }

    public ArrayList<MenuItem> getItems() {
        return new ArrayList<>(items);
    }
}