using System;
using System.Collections.Generic;

public class Advertisement
{
    private string product_id = "";
    private string category = "";
    private float ad_balance;
    public List<string> ad_media_src = new List<string>();
    public int set_balance() { return new Random().Next(100); }
    public int set_category(string value) { try { category = value; return 1; } catch (Exception) { return 0; } }
    public int add_media(string[] newMediaList) { return 1; }
    public string get_productId() { return product_id; }
    public string get_category() { return category; }
    public float get_adBalance() { return ad_balance; }
}
