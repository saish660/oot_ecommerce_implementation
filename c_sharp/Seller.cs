using System;
using System.Collections.Generic;

public class Seller : User
{
    private string seller_id = "";
    private string seller_name = "";
    public float avg_rating;
    private string location = "";
    private List<Product> products = new List<Product>();
    public bool set_details(string email, string ph_no, string seller_name, string location) { try { this.email = email; this.ph_no = ph_no; this.seller_name = seller_name; this.location = location; return true; } catch (Exception) { return false; } }
    public bool set_location(string newLocation) { try { location = newLocation; return true; } catch (Exception) { return false; } }
    public string[] get_products() { return new string[] { "product1", "product2" }; }
    public string get_location() { return location; }
    public string get_seller_id() { return seller_id; }
    public string get_seller_name() { return seller_name; }
}
