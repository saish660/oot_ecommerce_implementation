/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents the Wishlist of the user. It stores the items in the list.

*/

import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private String name;
    public int item_count;
    public List<Product> wishlisted_items = new ArrayList<>();

    public List<Product> get_wishlist() {
        return this.wishlisted_items;
    }

    public int add_item(Product newItem) {
        try {
            this.wishlisted_items.add(newItem);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int set_name(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public String get_name() {
        return this.name;
    }
}