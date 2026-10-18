using System;
using System.Collections.Generic;

public class Cart
{
    private List<Product> products = new List<Product>();
    private int total_price;
    public bool add_item(Product newItem) { try { products.Add(newItem); return true; } catch (Exception) { return false; } }
    public bool remove_item(Product item) { return true; }
    public bool create_order() { return true; }
    public List<Product> get_products() { return products; }
    public int get_total() { return total_price; }
}
