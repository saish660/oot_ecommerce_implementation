using System;
using System.Collections.Generic;

public class Sale
{
    public string name = "";
    public string description = "";
    public List<int> offers = new List<int>();
    public string start_date = "";
    public float duration_hours;
    public bool launch_sale() { return true; }
    public bool stop_sale() { return true; }
    public bool add_offer(int offer) { try { offers.Add(offer); return true; } catch (Exception) { return false; } }
    public bool remove_offer(string offer) { return true; }
    public float get_duration() { return duration_hours; }
    public bool set_start_date(string date) { try { start_date = date; return true; } catch (Exception) { return false; } }
}
