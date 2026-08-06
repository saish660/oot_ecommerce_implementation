/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class is extended from the User base class. It represents the seller accounts on the platform. It stores and manages their details, ratings, products sold by them.

*/


import java.util.List;
import java.util.ArrayList;

public class Seller extends User {
    public String seller_id;
    public String seller_name;
    public float avg_rating;
    public String location; // Stores the location where the seller is operating from
    public List<Product> products = new ArrayList<Product>();

    public boolean update_details(String email, String ph_no, String seller_name, String location) {
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

    public boolean update_location(String newLocation) {
        try {
            this.location = newLocation;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String[] list_products() {
        return new String[]{"product1", "product2"};    
    }
}