package Menu;

import java.util.ArrayList;;

public class MenuDatabase {
    private ArrayList<MenuItem> menuItems;

    public MenuDatabase() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        if (findMenuItemById(item.getId()) != null) {
            System.out.println("Item dengan ID " + item.getId() + " sudah ada pada Menu. Gagal menambahkan menu " + item.getId());
            return;
        }
        menuItems.add(item);
    }

    public boolean removeMenuItem(String id) {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            if (item.getId() == id) {
                menuItems.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }

    public MenuItem findMenuItemById(String id){
        for (MenuItem item : menuItems){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public MenuItem findMenuItemByName(String name){
        for (MenuItem item : menuItems) {
            if (item.getName() == name) {
                return item;
            }
        }
        return null;
    }
}