using System;
using System.Collections.Generic;

public class Product
{
    private string product_id = "";
    private string name = "";
    private string description = "";
    private int price;
    private int discount;
    public List<string> image_src = new List<string>();
    private float rating;
    public int stock;
    public bool update_stock() { return true; }
    public void get_details() { Console.WriteLine("ProductId: " + product_id + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "\nDiscount: " + discount + "\nRatings: " + rating); }
    public string get_product_id() { return product_id; }
    public string get_product_name() { return name; }
    public string get_product_description() { return description; }
    public int get_product_price() { return price; }
    public int get_product_discount() { return discount; }
    public float get_product_rating() { return rating; }
    public bool set_product_name(string newName) { try { name = newName; return true; } catch (Exception) { return false; } }
    public bool set_product_description(string newDescription) { try { description = newDescription; return true; } catch (Exception) { return false; } }
    public bool set_price(int newPrice) { try { price = newPrice; return true; } catch (Exception) { return false; } }
    public bool set_discount(int newDiscount) { try { discount = newDiscount; return true; } catch (Exception) { return false; } }
}
