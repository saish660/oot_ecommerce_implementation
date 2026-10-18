using System;
using System.Collections.Generic;

public class Wishlist
{
    private string name = "";
    public int item_count;
    public List<Product> wishlisted_items = new List<Product>();
    public List<Product> get_wishlist() { return wishlisted_items; }
    public bool add_item(Product newItem) { try { wishlisted_items.Add(newItem); return true; } catch (Exception) { return false; } }
    public bool set_name(string name) { try { this.name = name; return true; } catch (Exception) { return false; } }
    public string get_name() { return name; }
}
