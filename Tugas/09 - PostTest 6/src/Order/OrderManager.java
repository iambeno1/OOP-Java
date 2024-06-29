package Order;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void createOrder(Order order) {
        if (findOrderById(order.getOrderId()) != null) {
            System.out.println("Order dengan ID " + order.getOrderId() + " sudah ada. Gagal menambahkan order " + order.getOrderId());
            return;
        }
        orders.add(order);
    }

    boolean removeOrder(String orderId) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderId() == orderId) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public Order findOrderById(String orderId){
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
}
