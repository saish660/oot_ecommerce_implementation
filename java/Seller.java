/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class is extended from the User base class. It represents the seller accounts on the platform. It stores and manages their details, ratings, products sold by them.

*/


import java.util.List;
import java.util.ArrayList;

public class Seller extends User {
    private String seller_id;
    private String seller_name;
    public float avg_rating;
    private String location; // Stores the location where the seller is operating from
    private List<Product> products = new ArrayList<Product>();

    public boolean set_details(String email, String ph_no, String seller_name, String location) {
        try {
            this.email = email;
            this.ph_no = ph_no;
            this.seller_name = seller_name;
            this.location = location;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean set_location(String newLocation) {
        try {
            this.location = newLocation;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String[] get_products() {
        return new String[]{"product1", "product2"};    
    }

    public String get_location() {
        return this.location;
    }

    public String get_seller_id() {
        return this.seller_id;
    }

    public String get_seller_name() {
        return this.seller_name;
    }
}