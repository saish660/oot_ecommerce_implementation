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
    public int total_price;
    public int order_date;
    public String order_status;
    public List<Product> order_items = new ArrayList<>();   // Stores the product ids of the items


    public int place_order() {
        return 1;
    }

    public int cancel_order() {
        return 1;
    }

    public String get_status() {
        return this.order_status;
    }
}