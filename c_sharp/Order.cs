using System;
using System.Collections.Generic;

public class Order
{
    private string order_id = "";
    public int item_count;
    private int total_price;
    private int order_date;
    private string order_status = "";
    private List<int> order_items = new List<int>();
    public bool place_order() { return true; }
    public bool cancel_order() { return true; }
    public bool add_order_item(int product_id) { try { order_items.Add(product_id); return true; } catch (Exception) { return false; } }
    public bool set_order_date(int date) { try { order_date = date; return true; } catch (Exception) { return false; } }
    public bool set_order_status(string status) { try { order_status = status; return true; } catch (Exception) { return false; } }
    public string get_status() { return order_status; }
    public int get_total_price() { return total_price; }
    public int get_order_date() { return order_date; }
    public List<int> get_order_items() { return order_items; }
    public string get_order_id() { return order_id; }
}
