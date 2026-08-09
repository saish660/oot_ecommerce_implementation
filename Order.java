/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents individual orders of the users. It can place or cancel the order. It stores details about the individual order.
*/

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String order_id;
    public int item_count;
    private int total_price;
    private int order_date;
    private String order_status;
    private List<Integer> order_items = new ArrayList<>(); // Stores the product ids of the items

    public int place_order() {
        return 1;
    }

    public int cancel_order() {
        return 1;
    }

    public int add_order_item(int product_id) {
        try {
            this.order_items.add(product_id);
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public int set_order_date(int order_date) {
        try {
            this.order_date = order_date;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public int set_order_status(String new_status) {
        try {
            this.order_status = new_status;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public String get_status() {
        return this.order_status;
    }

    public int get_total_price() {
        return this.total_price;
    }

    public int get_order_date() {
        return this.order_date;
    }

    public List<Integer> get_order_items() {
        return this.order_items;
    }

    public String get_order_id() {
        return this.order_id;
    }
}