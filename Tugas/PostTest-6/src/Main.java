import Menu.MenuItem;
import Menu.MenuDatabase;
import Order.Order;
import Order.OrderManager;
// import Util.IdGenerator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek MenuDatabase
        MenuDatabase menuDatabase = new MenuDatabase();

        // Menambahkan item-menu ke MenuDatabase
        MenuItem menuItem1 = new MenuItem("M1", "Nasi Goreng", 15000);
        MenuItem menuItem2 = new MenuItem("M2", "Mie Ayam", 12000);
        MenuItem menuItem3 = new MenuItem("M3", "Ayam Bakar", 20000);
        MenuItem menuItem4 = new MenuItem("M3", "Nasi Uduk", 20000);

        menuDatabase.addMenuItem(menuItem1);
        menuDatabase.addMenuItem(menuItem2);
        menuDatabase.addMenuItem(menuItem3);
        menuDatabase.addMenuItem(menuItem4);

        // Menampilkan menu
        System.out.println("Menu:");
        ArrayList<MenuItem> menuItems = menuDatabase.getMenuItems();
        for (MenuItem item : menuItems) {
            System.out.println(item.getId() + " - " + item.getName() + " : " + item.getPrice());
        }

        // Membuat objek OrderManager
        OrderManager orderManager = new OrderManager();

        // Menambahkan pesanan
        Order order1 = new Order();
        order1.addItem(menuItem1);
        Order order2 = new Order();
        order2.addItem(menuItem2);

        orderManager.createOrder(order1);
        orderManager.createOrder(order2);
        orderManager.createOrder(order2);

        // Menampilkan pesanan
        System.out.println("\nDaftar Pesanan:");
        ArrayList<Order> orders = orderManager.getOrders();
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            ArrayList<MenuItem> orderItems = order.getItems();
            System.out.println("Items:");
            for (MenuItem item : orderItems) {
                System.out.println("- " + item.getName() + " : " + item.getPrice());
            }
        }

        System.out.println();

        // Mencari item menu berdasarkan ID
        String cariIdItem = "M2";
        MenuItem idStatus = menuDatabase.findMenuItemById(cariIdItem);

        if (idStatus != null){
            System.out.println("Id " + cariIdItem + " ditemukan : " + idStatus.getName());
        } else{
            System.out.println("Item dengan Id " + cariIdItem + " tidak ditemukan.");
        }

        System.out.println();

        // Mencari item menu berdasarkan Nama
        String cariNamaItem = "Ayam Bakar";
        MenuItem namaStatus = menuDatabase.findMenuItemByName(cariNamaItem);

        if (namaStatus != null){
            System.out.println("Nama " + cariNamaItem + " ditemukan : " + namaStatus.getName());
        } else{
            System.out.println("Item dengan nama " + cariNamaItem + " tidak ditemukan.");
        }
    }
}
