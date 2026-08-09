/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents the products sold on the platform. It stores every detail about the product. It can also apply discount to a product
*/

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String product_id;
    private String name;
    private String description;
    private int price;
    private int discount = 0; // percentage of discount to be applied
    public List<String> image_src = new ArrayList<>(); // list of public urls of the media
    private float rating;
    public int stock; // stock available with the seller

    public int update_stock() {
        return 1;
    }

    public void get_details() {
        System.out.println("ProductId: " + product_id + "\nName: " + name + "\nDescription: "
                + description + "\nPrice: " + price + "\nDiscount: " + discount + "\nRatings: " + rating);
    }

    public String get_product_id() {
        return this.product_id;
    }

    public String get_product_name() {
        return this.name;
    }

    public String get_product_description() {
        return this.description;
    }

    public int get_product_price() {
        return this.price;
    }

    public int get_product_discount() {
        return this.discount;
    }

    public float get_product_rating() {
        return this.rating;
    }

    public int set_product_name(String newName) {
        try {
            this.name = newName;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public int set_product_description(String newDescription) {
        try {
            this.description = newDescription;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public int set_price(int newPrice) {
        try {
            this.price = newPrice;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

    public int set_discount(int newDiscount) {
        try {
            this.discount = newDiscount;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}