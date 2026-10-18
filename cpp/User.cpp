#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class User
{
protected:
    int user_id = 0;
    string email, ph_no, password;

public:
    bool register_user(int uid, string new_email, string new_ph_no, string passwd)
    {
        user_id = uid;
        email = new_email;
        ph_no = new_ph_no;
        password = passwd;
        return true;
    }
    bool set_uid(int uid)
    {
        user_id = uid;
        return true;
    }
    bool set_email(string value)
    {
        email = value;
        return true;
    }
    bool set_ph_no(string value)
    {
        ph_no = value;
        return true;
    }
    bool set_passwd(string value)
    {
        password = value;
        return true;
    }
    bool login(int uid, string passwd) { return true; }
    string get_user_email() { return email; }
    string get_ph_no() { return ph_no; }
};
