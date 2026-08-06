/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class manages the shopping cart of user, adding and removing items from the cart. It only stores the items and can convert the cart to an order.
*/


import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Product> products = new ArrayList<>();  // Only stores the products ids of the items.
    public int total_price;


    public int add_item(Product newItem) {
        try {
            this.products.add(newItem);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int remove_item(Product Item) {
        return 1;
    }

    public int create_order() {
        return 1;
    }
}