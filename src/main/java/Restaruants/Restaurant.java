package Restaruants;

import java.util.ArrayList;

public class Restaurant {

    private ArrayList<MenuList> menuItem = new ArrayList<MenuList>();

   

    public void addItem(String name, double price, double rating) {
        MenuList newList = new MenuList(name, price, rating);
        menuItem.add(newList);
        System.out.println(name + " added to the menu.");

    }

    public void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < menuItem.size(); i++) {
            if (menuItem.get(i).getName().equalsIgnoreCase(name)) {
                menuItem.remove(i);
                System.out.println(name + " removed from the menu.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(name + " not found the menu.");

        }

    }

    public double calculateAverageRating() {
        double totalRating = 0;
        if (menuItem.isEmpty()) {
            System.out.println("no item this muenulist for calculate average");
        } else {
            for (MenuList item : menuItem) {
                totalRating += item.getRating();

            }

        }
        return totalRating / menuItem.size();
    }

    public void displayMenuList() {
        if (menuItem.isEmpty()) {
            System.out.println("no item this muenulist");
        } else {
            for (MenuList item : menuItem) {
                System.out.println("menu list : " + item.getName());
            }

        }
    }

}
