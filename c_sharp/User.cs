using System;
using System.Collections.Generic;

public class User
{
    protected int user_id;
    protected string email = "";
    protected string ph_no = "";
    protected string password = "";

    public bool register(int uid, string email, string ph_no, string passwd)
    {
        try { user_id = uid; this.email = email; this.ph_no = ph_no; password = passwd; return true; }
        catch (Exception) { return false; }
    }
    public bool set_uid(int uid) { try { user_id = uid; return true; } catch (Exception) { return false; } }
    public bool set_email(string email) { try { this.email = email; return true; } catch (Exception) { return false; } }
    public bool set_ph_no(string ph_no) { try { this.ph_no = ph_no; return true; } catch (Exception) { return false; } }
    public bool set_passwd(string passwd) { try { password = passwd; return true; } catch (Exception) { return false; } }
    public bool login(int uid, string passwd) { return true; }
    public string get_user_email() { return email; }
    public string get_ph_no() { return ph_no; }
}
