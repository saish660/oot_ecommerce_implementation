using System;
using System.Collections.Generic;

public class Buyer : User
{
    private string address = "";
    private string name = "";
    private List<string> paymentOptions = new List<string>();
    public bool set_details(int uid, string email, string ph_no) { try { user_id = uid; this.email = email; this.ph_no = ph_no; return true; } catch (Exception) { return false; } }
    public bool set_address(string address) { try { this.address = address; return true; } catch (Exception) { return false; } }
    public bool set_name(string name) { try { this.name = name; return true; } catch (Exception) { return false; } }
    public bool add_payment_option(string payment_method) { try { paymentOptions.Add(payment_method); return true; } catch (Exception) { return false; } }
    public bool place_order() { return true; }
    public int[] get_cart() { return new int[] { 1, 2 }; }
    public string getName() { return name; }
    public string getAddress() { return address; }
}
