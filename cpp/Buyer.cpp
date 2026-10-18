#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Buyer : public User {
    string address, name;
    vector<string> paymentOptions;
public:
    bool set_details(int uid, string new_email, string new_ph_no) { user_id = uid; email = new_email; ph_no = new_ph_no; return true; }
    bool set_address(string value) { address = value; return true; }
    bool set_name(string value) { name = value; return true; }
    bool add_payment_option(string value) { paymentOptions.push_back(value); return true; }
    bool place_order() { return true; }
    vector<int> get_cart() { return {1, 2}; }
    string getName() { return name; }
    string getAddress() { return address; }
};
