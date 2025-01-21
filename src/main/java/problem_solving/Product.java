package problem_solving;

import java.util.ArrayList;

public class Product {

    ArrayList<inventory> productList = new ArrayList<inventory>();

    public void addProduct(inventory i) {
        productList.add(i);

    }

    public void removeProduct(inventory i) {
        productList.remove(i);

    }

    public ArrayList<inventory> getProductList() {
        return productList;
    }

    public void checkLowInventory() {

        for (inventory inv : productList) {
            if (inv.getQty() <= 100) {
                System.out.println(inv.getName() + " is running low on inventory. Current quantity: " + inv.getQty());

            }
        }

    }

}
