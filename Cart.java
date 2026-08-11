/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class manages the shopping cart of user, adding and removing items from the cart. It only stores the items and can convert the cart to an order.
*/


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();  // Only stores the products ids of the items.
    private int total_price;

    public boolean add_item(Product newItem) {
        try {
            this.products.add(newItem);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove_item(Product Item) {
        return true;
    }

    public boolean create_order() {
        return true;
    }

    public List<Product> get_products() {
        return this.products;
    }

    public int get_total() {
        return this.total_price;
    }
}