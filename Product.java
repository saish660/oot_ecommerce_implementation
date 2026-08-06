/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents the products sold on the platform. It stores every detail about the product. It can also apply discount to a product
*/

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String product_id;
    public String name;
    public String description;
    public int price;
    public int discount=0;  // percentage of discount to be applied
    public List<String> image_src = new ArrayList<>();  // list of public urls of the media
    public float rating;
    public int stock;   // stock available with the seller


    public int apply_discount(int newDiscount) {
        try {
            this.discount = newDiscount;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int update_stock() {
        return 1;
    }

    public void get_details() {
        System.out.println("ProductId: " + product_id + "\nName: " + name + "\nDescription: "
        + description + "\nPrice: " + price + "\nDiscount: " + discount + "\nRatings: " + rating
        );
    }
}